package com.framework.victorafonso.resource;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutRequest implements Serializable {

	private String firstName;
	private String lastame;
	private String email;
	private String address;
	private String complement;
	private String country;
	private String state;
	private String cep;
	private Boolean saveAddress;
	private Boolean saveInfo;
	private String paymentMethod;
	private String cardName;
	private String cardNumber;
	private String cardDate;
	private String cardCvv;

}
