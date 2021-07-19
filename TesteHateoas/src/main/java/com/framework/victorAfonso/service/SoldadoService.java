package com.framework.victorAfonso.service;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.framework.victorAfonso.controller.request.SoldadoEditRequest;
import com.framework.victorAfonso.controller.response.SoldadoListResponse;
import com.framework.victorAfonso.controller.response.SoldadoResponse;
import com.framework.victorAfonso.dto.Soldado;
import com.framework.victorAfonso.entity.SoldadoEntity;
import com.framework.victorAfonso.repostory.SoldadoRepository;
import com.framework.victorAfonso.resource.ResourceSoldado;

@Service
public class SoldadoService {

	private SoldadoRepository soldadoRepository;
	private ObjectMapper objectMapper;
	private ResourceSoldado resourceSoldado;

	public SoldadoService(SoldadoRepository soldadoRepository, ObjectMapper objectMapper,
			ResourceSoldado resourceSoldado) {
		this.soldadoRepository = soldadoRepository;
		this.objectMapper = objectMapper;
		this.resourceSoldado = resourceSoldado;
	}

	public SoldadoResponse buscarSoldado(Long id) throws Throwable {
		Supplier exceptionSupplier = null;
		SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow(exceptionSupplier);
		SoldadoResponse soldadoResponse = objectMapper.convertValue(soldado, SoldadoResponse.class);
		return soldadoResponse;
	}

	public void criarSoldado(Soldado soldado) {
		SoldadoEntity soldadoEntity = objectMapper.convertValue(soldado, SoldadoEntity.class);
		soldadoRepository.save(soldadoEntity);
	}

	public void alterarSoldado(Long id, SoldadoEditRequest soldadoEditRequest) {
		SoldadoEntity soldadoEntity = objectMapper.convertValue(soldadoEditRequest, SoldadoEntity.class);
		soldadoEntity.setId(id);
		soldadoRepository.save(soldadoEntity);
	}

	public void deletarSoldado(Long id) throws Throwable {
		Supplier exceptionSupplier = null;
		SoldadoEntity soldado = soldadoRepository.findById(id).orElseThrow(exceptionSupplier);
		soldadoRepository.delete(soldado);
	}

	public List<SoldadoListResponse> buscarSoldados() {
		List<SoldadoEntity> all = soldadoRepository.findAll();
		List<SoldadoListResponse> soldadoStream = all.stream().map(it -> {
			try {
				return resourceSoldado.CriarLink(it);
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}).collect(Collectors.toList());
		return soldadoStream;
	}
}
