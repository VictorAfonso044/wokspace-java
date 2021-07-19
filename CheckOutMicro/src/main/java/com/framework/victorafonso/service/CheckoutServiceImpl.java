package com.framework.victorafonso.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.framework.victorafonso.entity.CheckoutEntity;
import com.framework.victorafonso.event.CheckoutCreatedEvent;
import com.framework.victorafonso.repository.CheckoutRepository;
import com.framework.victorafonso.resource.CheckoutRequest;
import com.framework.victorafonso.streaming.CheckoutCreatedSource;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService {


	private final CheckoutRepository checkoutRepository;
	private final CheckoutCreatedSource checkoutCreatedSource;
	@Override
	public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
		final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
				.code(UUID.randomUUID().toString())
				.status(CheckoutEntity.Status.CRETED)
				.build();
		final CheckoutEntity saveEntity = checkoutRepository.save(checkoutEntity);
		final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent.newBuilder()
				.setCheckoutCode(saveEntity.getCode())
				.setStatus(saveEntity.getStatus().name())
				.build();
		checkoutCreatedSource.output().send(MessageBuilder.withPayload(checkoutCreatedEvent).build());
		return Optional.of(saveEntity);
	}
}
