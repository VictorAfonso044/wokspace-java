package com.example.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.models.Cadastro;


public interface UsuarioRepository extends JpaRepository<Cadastro,Long> {

	

}
