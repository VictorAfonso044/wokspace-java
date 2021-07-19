package com.framework.victorafonso.service;

import java.util.Optional;

import com.framework.victorafonso.entity.CheckoutEntity;
import com.framework.victorafonso.resource.CheckoutRequest;

public interface CheckoutService {
	
	Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
