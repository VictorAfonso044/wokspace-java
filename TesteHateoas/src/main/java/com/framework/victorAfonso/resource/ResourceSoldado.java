package com.framework.victorAfonso.resource;

import org.springframework.hateoas.Link;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.framework.victorAfonso.controller.SoldadoController;
import com.framework.victorAfonso.controller.response.SoldadoListResponse;
import com.framework.victorAfonso.entity.SoldadoEntity;

@Component
public class ResourceSoldado {
	private ObjectMapper objectMapper;

	public ResourceSoldado(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public SoldadoListResponse CriarLink(SoldadoEntity soldadoEntity) throws Throwable {
		SoldadoListResponse soldadoListResponse = objectMapper.convertValue(soldadoEntity, SoldadoListResponse.class);
		Link link = linkTo(methodOn(SoldadoController.class).buscarSoldado(SoldadoEntity.getId())).withSelfRel();
		soldadoListResponse.add(link);
		return soldadoListResponse;
	}

}
