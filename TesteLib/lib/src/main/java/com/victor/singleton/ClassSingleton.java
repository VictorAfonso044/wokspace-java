package com.victor.singleton;

import java.util.HashSet;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.victor.repository.GenericRepository;

@Component
public class ClassSingleton {
	
	private Map<String, HashSet<String>> metaDados;
	
	@Autowired
	GenericRepository repository;

	@PostConstruct
	public void init() {
		this.metaDados = repository.doWork();
	}

	
	public void verificar(String nomeTabela, Map<String, String> params) {
		HashSet<String> colunas = this.metaDados.get(nomeTabela);
		if (colunas == null) {
			throw new RuntimeException("Tabela não existe");
		} else {
			for (String colunaParam : params.keySet()) {
				if (!colunas.contains(colunaParam)) {
					throw new RuntimeException("Coluna não existe");
				} else {
					System.out.print("Hash existe");
				}
			}
		}
	}

}
