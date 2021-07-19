package com.example.teste.models.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CadastroDTO {

	private Long idbeneficiario;
	private Long idprontuario;
	private int numcarteira;
	private String nomebeneficiario;
	private Date datanascimento;
	private Date datainclusao;

}
