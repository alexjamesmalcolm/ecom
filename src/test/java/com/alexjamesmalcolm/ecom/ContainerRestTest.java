package com.alexjamesmalcolm.ecom;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ContainerRestTest {
	
	@Resource
	private TestRestTemplate restTemplate;
	
	@Test
	public void exampleTest() {
		ResponseEntity<String> response = restTemplate.getForEntity("/products", String.class);
		
		HttpStatus status = response.getStatusCode();
		
		assertThat(status, is(HttpStatus.OK));
	}

}
