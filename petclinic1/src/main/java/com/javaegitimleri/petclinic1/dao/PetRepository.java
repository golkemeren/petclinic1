package com.javaegitimleri.petclinic1.dao;

import java.util.List;

import com.javaegitimleri.petclinic1.model.Owner;
import com.javaegitimleri.petclinic1.model.Pet;

public interface PetRepository {

	 Pet findById(Long id);
      List<Pet> findByOwnerId(Long ownerId); //owenerıd si verilen tüm pet kayıtlarını döndürür dolayısıyla return tipi java.util.list
      void create(Pet pet);
      Pet update(Pet pet);
      void delete(Long id);
      void deleteByOwnerId(Long ownerId); // owenerId si verilen pet kayıtlarını siler .
      
      
      
	 
	 
	
	
}
