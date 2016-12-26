package com.example.ems.common;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpClient {
	

	public static void main(String[] args) {
		
	
		    final String uri = "http://localhost:8080/demo1/electionservice/parties";
		     
		    RestTemplate restTemplate = new RestTemplate();
		     
		    HttpHeaders headers = new HttpHeaders();
		    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		     
		    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		     
		    System.out.println(result);
		}
		
		
	

}
