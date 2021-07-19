package info.java.tips.action;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.google.gson.Gson;

import info.java.tips.form.Usuarios;
import info.java.tips.models.Usuario;
import info.java.tips.ws.CadastroRequestWS;
import info.java.tips.ws.IndicatorEndpointService;
import info.java.tips.ws.User;
public class UsuariosAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Gson gson = new Gson();
		Usuarios user = (Usuarios) form;
		ActionForward fw = mapping.getInputForward();
		URL url = new URL("http://localhost:8010/api/usuarios");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
		Usuario[] obj = gson.fromJson(br, Usuario[].class);
		List<Usuario> listaDeUsers = Arrays.asList(obj);
		user.setList(listaDeUsers);
		fw = mapping.findForward("ver");
		return fw;
	}

}

