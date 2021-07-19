package com.example.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste.models.Cadastro;
import com.example.teste.repository.UsuarioRepository;
import com.example.teste.user.GetUserRequest;

@Service
public class XmlService {
	
	@Autowired
	com.example.teste.Service service;
	
	
	public Cadastro cadastrar(GetUserRequest request) {
		Cadastro cadastro = new Cadastro();
		cadastro.setNomebeneficiario(request.getNomebeneficiario());
		cadastro.setIdbeneficiario(request.getIdbeneficiario());
		cadastro.setIdprontuario(request.getIdprontuario());
		cadastro.setNumcarteira(request.getNumcarteira());
		cadastro.setDatanascimento(request.getDatanascimento());
		cadastro.setDatainclusao(request.getDatainclusao());
		service.adicionar(cadastro);
		return cadastro;
	}

}
