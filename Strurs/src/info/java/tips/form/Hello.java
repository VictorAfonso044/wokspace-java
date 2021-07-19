package info.java.tips.form;

import java.util.Date;


import org.apache.struts.action.ActionForm;

import lombok.Data;

@Data
public class Hello extends ActionForm {

	private String nomeBeneficiario;
	
	private Long idBeneficiario;
	
	private Long idProntuario;
	
	private String dataNascimento;
	
	private String dataInclusao;
	
	private Integer numCarteira; 
	

	
}
