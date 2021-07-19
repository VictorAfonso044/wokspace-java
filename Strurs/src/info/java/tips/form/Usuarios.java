package info.java.tips.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import info.java.tips.models.Usuario;
import lombok.Data;

@Data
public class Usuarios extends ActionForm {
	
	private List<Usuario> list;
	

}
