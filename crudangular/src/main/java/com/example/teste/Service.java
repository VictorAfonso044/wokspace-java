package com.example.teste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste.models.Cadastro;
import com.example.teste.models.dto.CadastroDTO;
import com.example.teste.repository.UsuarioRepository;
import com.example.teste.repository.impl.UsuarioRepositoryImpl;

@RestController
@RequestMapping("/api")
public class Service {

	@RequestMapping("/test")
	public String teste() {
		return "Funciona karai";
	}

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	UsuarioRepositoryImpl impl;

	@GetMapping("/usuarios")
	public List<Cadastro> getUsuarios() {
		//return impl.buscaUsuarios();
		return usuarioRepository.findAll();
	}

	@GetMapping("/usuario/{idbeneficiario}")
	public Cadastro getUserById(@PathVariable(value = "idbeneficiario") Long idbeneficiario) {
		return usuarioRepository.getOne(idbeneficiario);
	}

	@PostMapping("/cadastrar")
	public Cadastro adicionar(@RequestBody Cadastro cadastro) {
		return usuarioRepository.save(cadastro);
	}

	@GetMapping("/procedure/{numcampos}")
	public void createRandom(@PathVariable(value = "numcampos") Long numcampos) {
		impl.random(numcampos);
	}

	@PostMapping("/excluir")
	public void excluir(@RequestBody Long idbeneficiario) {
		usuarioRepository.deleteById(idbeneficiario);
	}

	@PutMapping("/atualizar")
	public Cadastro atualizar(@RequestBody Cadastro cadastro) {
		return usuarioRepository.save(cadastro);
	}

}
