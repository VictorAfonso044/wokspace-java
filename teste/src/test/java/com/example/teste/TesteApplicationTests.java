package com.example.teste;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.teste.controller.Jsonplaceholder;

@SpringBootTest
class TesteApplicationTests {

	@Test
	public void consumir(){
		RestTemplate template = new RestTemplate();
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host("jsonplaceholder.typicode.com")
				.path("posts/1")
				.build();
		
		ResponseEntity<Jsonplaceholder> response = template.getForEntity(uri.toUriString(), Jsonplaceholder.class);
		System.out.print(response.getBody().getTitle());
	}

}
