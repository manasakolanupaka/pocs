package com.example.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class EmployeeTest {
	@Test
	public void testCreateEmployee() throws URISyntaxException
	{
		RestTemplate restTemplate= new RestTemplate();
		final String baseUrl= "http://localhost:8000/api/emp/createEmployee";
		URI uri= new URI(baseUrl);
	}

}
