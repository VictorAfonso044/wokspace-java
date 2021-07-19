package com.example.teste.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Transactional
@org.springframework.stereotype.Repository
public class Repository {

	@PersistenceContext(unitName = "default")
	private EntityManager entityManager;

	public Object getAll(String tabela) {
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ").append(tabela);
		final Query query = entityManager.createNativeQuery(sql.toString());
		return query.getResultList();
	}

	public String getByParameter(String tabela, Map<String, String> parametros) {
		String params = extrairKey(parametros, false);
		Collection<String> values = parametros.values();
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM ").append(tabela).append(" where 1=1 AND ").append(params);
		System.out.println(sql.toString());
		final Query query = entityManager.createNativeQuery(sql.toString());
		int i = 1;
		for (Iterator<String> iter = values.iterator(); iter.hasNext();) {
			query.setParameter(i, iter.next());
			i++;
		}
		// return query.getResultList();
		return " Executando By id:  " + query.toString();
	}

	public String delete(String tabela, Map<String, String> parametros) {
		String params = extrairKey(parametros, false);
		Collection<String> values = parametros.values();
		final StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM ").append(tabela).append(" where 1=1 AND ").append(params);
		/*
		 * System.out.println(sql.toString()); final Query query =
		 * entityManager.createNativeQuery(sql.toString());
		 * System.out.println(query.toString()); int i = 1; for (Iterator<String> iter =
		 * values.iterator(); iter.hasNext();) { query.setParameter(i, iter.next());
		 * i++; }
		 */
		// return query.getResultList();
		return " Executando " + sql.toString() + values;
	}

	public String update(String tabela, Map<String, String> parametros, Map<String, String> objeto) {
		String params = extrairKey(parametros, false);
		String objKeys = extrairKey(objeto, false);
		Collection<String> values = parametros.values();
		Collection<String> objValues = objeto.values();
		List<String> test = new ArrayList();
		final StringBuilder sql = new StringBuilder();

		sql.append("UPDATE ").append(tabela).append(" SET ").append(objKeys).append(" where 1=1 AND ").append(params);
		// final Query query = entityManager.createNativeQuery(sql.toString());
		int i = 1;
		for (Iterator<String> iter = objValues.iterator(); iter.hasNext();) {
			// query.setParameter(i, iter.next());
			test.add(i + "-" + iter.next());
			i++;
		}
		for (Iterator<String> iter = values.iterator(); iter.hasNext();) {
			// query.setParameter(i, iter.next());
			test.add(i + "-" + iter.next());
			i++;
		}
		// return query.getResultList();
		return " Executando " + sql.toString() + test;
	}

	public String insert(String tabela, Map<String, String> objeto) {
		String objKeys = extrairKey(objeto, true);
		Collection<String> values = objeto.values();
		String q = createQuestion(values.size());
		final StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO ").append(tabela).append("(").append(objKeys).append(")").append(" VALUES ").append("(")
				.append(q).append(")");
		/*
		 * final Query query = entityManager.createNativeQuery(sql.toString()); int i =
		 * 1; for (Iterator<String> iter = values.iterator(); iter.hasNext();) {
		 * query.setParameter(i, iter.next()); i++; }
		 */
		// return query.getResultList();
		return "Fazendo " + sql.toString() + values;
	}

	public String extrairKey(Map<String, String> parametro, boolean insert) {
		final StringBuilder params = new StringBuilder();
		List<String> keylist = new ArrayList();
		Set<String> keys = parametro.keySet();
		for (Iterator<String> iter = keys.iterator(); iter.hasNext();) {
			keylist.add(iter.next());
		}
		int l = keylist.size() - 1;
		for (int i = 0; i < keylist.size(); i++) {
			if (!insert) {
				if (i == l) {
					params.append(keylist.get(l)).append("= ?");
				} else {
					params.append(keylist.get(i)).append("= ? AND ");
				}
			} else {
				if (i == l) {
					params.append(keylist.get(l));
				} else {
					params.append(keylist.get(i)).append(", ");
				}
			}

		}
		return params.toString();
	}

	private String createQuestion(int qtd) {
		final StringBuilder q = new StringBuilder();
		for (int i = 1; i <= qtd; i++) {
			if (i == qtd) {
				q.append("?");
			} else {
				q.append("?, ");
			}
		}
		return q.toString();
	}
}
