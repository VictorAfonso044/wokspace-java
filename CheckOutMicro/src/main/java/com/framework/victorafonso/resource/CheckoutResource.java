package com.framework.victorafonso.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.framework.victorafonso.entity.CheckoutEntity;
import com.framework.victorafonso.service.CheckoutService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

	private final CheckoutService checkoutService;
	
	@GetMapping
	public String teste() {
		return "FUNCIONA";
	}
	@PostMapping
	public ResponseEntity<CheckoutResponse> create(@RequestBody CheckoutRequest checkoutRequest) {
		checkoutService.create(checkoutRequest);
		final CheckoutEntity checkoutEntity = checkoutService.create(checkoutRequest).orElseThrow();
		final CheckoutResponse checkoutResponse = CheckoutResponse.builder().code(checkoutEntity.getCode()).build();
		return ResponseEntity.status(HttpStatus.CREATED).body(checkoutResponse);
	}

}
