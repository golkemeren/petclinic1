package com.javaegitimleri.petclinic1;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.javaegitimleri.petclinic1.model.Owner;

import junit.framework.Assert;

@SpringBootTest
public class Petclinic1ApplicationTests {
	
	private RestTemplate restTemplate;
	
	@BeforeEach   // setUp metotları her trst metodu çalışmadan önce çalışarak içerisindeki kodu execute eder. 
	public void setUp() {
		
		restTemplate = new RestTemplate();	
	}
	
	/*@Test
	public void testCreateOwner() {
		Owner owner = new Owner();
		owner.setFirstName("Metehan");
		owner.setLastName("Yücel");
		
		URI location=restTemplate.postForLocation("http://localhost:8080/rest/owner",owner);
	
	    Owner owner2 = restTemplate.getForObject(location, Owner.class);
	    
	    MatcherAssert.assertThat(owner2.getFirstName(),Matchers.equalTo(owner.getFirstName()));
	    MatcherAssert.assertThat(owner2.getLastName(),Matchers.equalTo(owner.getLastName()));
	}
	
	@Test
	public void testUpdateOwner () {
		Owner owner = restTemplate.getForObject("http://localhost:8080/rest/owner/4", Owner.class);
		
		MatcherAssert.assertThat(owner.getFirstName(),Matchers.equalTo("Salim"));
		owner.setFirstName("Salim Güray");
		restTemplate.put("http://localhost:8080/rest/owner/4", owner);
		
		owner = restTemplate.getForObject("http://localhost:8080/rest/owner/4", Owner.class);
		MatcherAssert.assertThat(owner.getFirstName(),Matchers.equalTo("Salim Güray"));
		
		
	}
	
	
	
	 @Test
	 public void testGetOwnerById() {
	ResponseEntity<Owner> response =restTemplate.getForEntity("http://localhost:8080/rest/owner/1", Owner.class);
	
	 MatcherAssert.assertThat(response.getStatusCodeValue(),Matchers.equalTo(200));
	 MatcherAssert.assertThat(response.getBody().getFirstName(),Matchers.equalTo("Kenan"));
	 }
	
	 @Test
	 public void testGetOwnersByLastName() {
		 ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8080/rest/owner?ln=Sevindik", List.class);
		  
				 MatcherAssert.assertThat(response.getStatusCodeValue(),Matchers.equalTo(200));
	                 
		       List<Map<String,String>> boy = response.getBody();
		     
		       List<String> firstName = boy.stream().map(e->e.get("firstName")).collect(Collectors.toList());
		       
		       MatcherAssert.assertThat(firstName,Matchers.containsInAnyOrder("Kenan","Hümeyra","Salim"));
	     }
	 
	 @Test
	 public void testDeleteOwner () {   // id si 1 olan kaydı sildik 
		 
		 restTemplate.delete("http://localhost:8080/rest/owner/1");
		 try {
		 restTemplate.getForEntity("http://localhost:8080/rest/owner/1",Owner.class);
		 Assert.fail("should have not return"); // hataya gelmemesi durumunda bir failer söz konusudur .bu yuzden bir assert.fail mesajı yazdırcaz
		 }catch(HttpClientErrorException ex) { // bir hata alabiliriz bu yuzden try catch içine aldık 
			
			MatcherAssert.assertThat(ex.getStatusCode().value(),Matchers.equalTo(404));  // gelen statü kodnunun 404 olup olmadığını kontrol ettik .
			 
		 }
	 }
	 
	 
	 
	 
	 
	@Test
	public void testGetOwners() {
		ResponseEntity <List> response = restTemplate.getForEntity("http://localhost:8080/rest/owners",List.class);
		
		MatcherAssert.assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
		
		List<Map<String,String>> boy = response.getBody();
	     
	       List<String> firstName = boy.stream().map(e->e.get("firstName")).collect(Collectors.toList());
	       
	       MatcherAssert.assertThat(firstName,Matchers.containsInAnyOrder("Kenan","Hümeyra","Salim","Muammer"));
	}
	*/
	
	
	
	
	}
	
	 
	 
	 


