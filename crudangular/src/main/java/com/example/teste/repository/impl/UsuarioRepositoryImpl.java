package com.example.teste.repository.impl;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.teste.models.dto.CadastroDTO;

import lombok.Getter;

@Getter
@Repository
public class UsuarioRepositoryImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public void random(Long numcampos) {
		Session session = entityManager.unwrap( Session.class );
        session.doWork(
            connection -> {
            try (CallableStatement function = connection
                .prepareCall(
                    "{call \"victor\".PROCEDURE2(?)}" )) {
                function.setLong(1,numcampos);
                function.execute();
            }
        });

	}

	public List<CadastroDTO> buscaUsuarios() {
		List<CadastroDTO> usuariosDto = new ArrayList<>();
		CadastroDTO dto = new CadastroDTO();
		final StringBuilder hql = new StringBuilder();
		hql.append(
				"SELECT idbeneficiario,nomebeneficiario,numcarteira,datanascimento,datainclusao,idprontuario FROM \"victor\".teste1");
		final Query query = getEntityManager().createNativeQuery(hql.toString());
		List<Object[]> list = (List<Object[]>) query.getResultList();
		for (int i = 0; i < list.size(); i++) {
			dto = new CadastroDTO();
			if (list.get(i) != null) {
				Object[] item = list.get(i);
				BigDecimal id = new BigDecimal(item[0].toString());
				BigDecimal idProntuario = new BigDecimal(item[5].toString());
				BigDecimal numcarteira = new BigDecimal(item[2].toString());
				dto.setIdbeneficiario((Long) id.longValue());
				dto.setNomebeneficiario((String) item[1]);
				dto.setNumcarteira((int) numcarteira.intValue());
				dto.setDatanascimento((Date) item[3]);
				dto.setDatainclusao((Date) item[4]);
				dto.setIdprontuario((Long) idProntuario.longValue());
				usuariosDto.add(dto);
			}
		}
		return usuariosDto;
	}

	
}
