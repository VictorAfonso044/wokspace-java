package com.example.teste;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.teste.models.Cadastro;
import com.example.teste.repository.Query;
import com.example.teste.repository.UsuarioRepository;

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
	Query query;

	@GetMapping("/usuarios")
	public List<Cadastro> getUsuarios() {
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

	@PostMapping("/excluir")
	public void excluir(@RequestBody Long idbeneficiario) {
		usuarioRepository.deleteById(idbeneficiario);
	}

	@PutMapping("/atualizar")
	public Cadastro atualizar(@RequestBody Cadastro cadastro) {
		return usuarioRepository.save(cadastro);
	}

}
