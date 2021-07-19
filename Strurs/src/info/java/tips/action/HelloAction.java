package info.java.tips.action;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import info.java.tips.form.Hello;
import info.java.tips.ws.CadastroRequestWS;
import info.java.tips.ws.IndicatorEndpointService;

public class HelloAction extends Action {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) throws DatatypeConfigurationException {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		
		return xmlCalendar;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Hello hello = (Hello) form;
		ActionForward fw = mapping.getInputForward();

		if (hello != null && hello.getNomeBeneficiario() != null) {
			URL url = new URL("http://localhost:8081/soap-api/solicita-ws?wsdl");
			CadastroRequestWS cadastroRequestWS = new CadastroRequestWS();
			IndicatorEndpointService indicatorEndpointService = new IndicatorEndpointService(url);
			cadastroRequestWS.setIdbeneficiario(hello.getIdBeneficiario());
			cadastroRequestWS.setNomebeneficiario(hello.getNomeBeneficiario());
			cadastroRequestWS.setNumcarteira(hello.getNumCarteira());
			cadastroRequestWS.setDatanascimento(toXMLGregorianCalendar(format.parse(hello.getDataNascimento())));
			cadastroRequestWS.setDatainclusao(toXMLGregorianCalendar(format.parse(hello.getDataInclusao())));
			cadastroRequestWS.setIdprontuario(hello.getIdProntuario());
			indicatorEndpointService.getCadastroPortTypePort().user(cadastroRequestWS);
			fw = mapping.findForward("success");
		} else {
			ActionErrors errs = new ActionErrors();
			errs.add("", new ActionMessage("hello.msg.err"));
			saveErrors((HttpServletRequest) request, errs);
		}
		return fw;
	}
}
