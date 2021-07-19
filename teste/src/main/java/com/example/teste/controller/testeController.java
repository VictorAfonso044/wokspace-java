package com.example.teste.controller;

import java.io.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/teste")
public class testeController {
	@RequestMapping("/consumir")
	public String consumir(){
		RestTemplate template = new RestTemplate();
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("jsonplaceholder.typicode.com")
				.path("posts/2")
				.build();
		
		ResponseEntity<Jsonplaceholder> response = template.getForEntity(uri.toUriString(), Jsonplaceholder.class);
	    File file = new File(response.getBody().getTitle() + ".txt");
	    try (Writer writer = new BufferedWriter(new FileWriter(file))) {
	        String contents = response.getBody().getBody();
	        writer.write(contents);

	        return "Sucesso seu documento foi criado com sucesso";

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
	
