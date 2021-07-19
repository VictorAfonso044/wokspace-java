package com.example.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.models.Cadastro;
import com.example.teste.models.dto.CadastroDTO;

public interface UsuarioRepository extends JpaRepository<Cadastro, Long> {

	
}
