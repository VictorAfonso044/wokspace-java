package info.java.tips.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DowloadAction extends Action {

	private static final String URLPDF = "http://localhost:8083/jasperserver/rest_v2/reports/reports/Pssj/Pssj.pdf?j_username=jasperadmin&j_password=jasperadmin";

	SalvaArquivo salvarquivo = new SalvaArquivo();

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
	    response.setHeader("Content-Disposition","attachment;filename=Pssj.pdf");
		salvarquivo.salvar(URLPDF,response.getOutputStream());
		
		return null;
	}

}
