package info.java.tips.models;

import lombok.Data;

@Data
public class Usuario {

	private Long idbeneficiario;
	private Long idprontuario;
	private Integer numcarteira; 
	private String nomebeneficiario;
	private String datanascimento;
	private String datainclusao;
	
}
