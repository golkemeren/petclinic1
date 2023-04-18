package com.javaegitimleri.petclinic1;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.javaegitimleri.petclinic1.model.Owner;
import com.javaegitimleri.petclinic1.model.Vet;
import com.javaegitimleri.petclinic1.service.PetClinicService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties= {"spirng.profiles.active=dev"})
public class PetClinicIntegrationTests {
	@Autowired
	  private PetClinicService petClinicService;
	
	@Test
	public void testFindOwners() {
		List<Owner> owners = petClinicService.findOwners();
		MatcherAssert.assertThat(owners.size(), Matchers.equalTo(10)); // listedeki owner sayısı 10'a eşitse test başarılı sonlanmalı 
		
		

		
	}
	
   @Test
	public void testFindVets() {
		List<Vet> vets = petClinicService.findVets();
		MatcherAssert.assertThat(vets.size(),Matchers.equalTo(3));
	}
	

}
