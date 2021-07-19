package com.example.teste.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.example.teste.models.Cadastro;
@Service
public class Query {
	EntityManager entityManager;

	public List<Cadastro> achatudo() {
		List<Cadastro> users = entityManager.createNativeQuery(
				"SELECT idbeneficiario,nomebeneficiario,numcarteira,datanascimento,datainclusao,idprontuario FROM \\\"victor\\\".teste1;")
				.getResultList();
		return users;
	}
	
	public void random(Long numcampos){
	String query = "BEGIN" + "\"victor\".PROCEDURE2("+ numcampos +");" + "END;";
	entityManager.createNativeQuery(query);
	
	}
	
}
;