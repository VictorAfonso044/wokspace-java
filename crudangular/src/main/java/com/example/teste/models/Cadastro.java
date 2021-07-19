package com.example.teste.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TESTE1", schema = "\"victor\"")
public class Cadastro {
	@Id
	@Column(name="idbeneficiario")
	private Long idbeneficiario;
	
	@Column(name="idprontuario")
	private Long idprontuario;
	
	@Column(name="numcarteira")
	private int numcarteira;
	
	@Column(name="nomebeneficiario")
	private String nomebeneficiario;
	
	@Column(name="datanascimento")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date datanascimento;
	
	@Column(name="datainclusao")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date datainclusao;
	
	public Long getIdbeneficiario() {
		return idbeneficiario;
	}
	public void setIdbeneficiario(Long idbeneficiario) {
		this.idbeneficiario = idbeneficiario;
	}
	public Long getIdprontuario() {
		return idprontuario;
	}
	public void setIdprontuario(Long idprontuario) {
		this.idprontuario = idprontuario;
	}
	public int getNumcarteira() {
		return numcarteira;
	}
	public void setNumcarteira(int numcarteira) {
		this.numcarteira = numcarteira;
	}
	public String getNomebeneficiario() {
		return nomebeneficiario;
	}
	public void setNomebeneficiario(String nomebeneficiario) {
		this.nomebeneficiario = nomebeneficiario;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Date getDatainclusao() {
		return datainclusao;
	}
	public void setDatainclusao(Date datainclusao) {
		this.datainclusao = datainclusao;
	}
}
