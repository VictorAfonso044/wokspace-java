package com.framework.victorafonso.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutCreatedSource {
	
	String OUTPUT = "checkout-created-output";
	
	@Output(OUTPUT)
	MessageChannel output();
	
	
	static void main() {
		int valor=0, multiplicador=1;
		List<Integer> binary = new ArrayList<>(Arrays.asList(0,0,0,1));
		for (int i = 0; i < binary.size(); i++) {
			multiplicador *= 2;
			valor += binary.get(i)*multiplicador;
		}
	}
}
