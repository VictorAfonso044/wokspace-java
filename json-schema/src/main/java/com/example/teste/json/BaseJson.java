package com.example.teste.json;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
@RequestMapping("/api")
public class BaseJson {

	private ObjectMapper mapper = new ObjectMapper();

	protected JsonNode getJsonNodeFromStringContent(String content) throws IOException {
		return mapper.readTree(content);
	}
	@GetMapping("/")
	public String teste() {
		String obj = "{ \"$schema\": 'http://json-schema.org/draft-04/schema#',title: 'Person',description: 'A person',type: 'object',properties:{name:{description: 'A person's name', type: 'string' }}}";
		try {
			System.out.println(getJsonNodeFromStringContent(obj));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return "AHHH";
	}
}