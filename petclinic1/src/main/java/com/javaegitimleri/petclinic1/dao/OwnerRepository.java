package com.javaegitimleri.petclinic1.dao;

import java.util.List;

import com.javaegitimleri.petclinic1.model.Owner;

public interface OwnerRepository {
   List<Owner> findAll();
   Owner findById(Long id );
   List<Owner> findByLastName(String lastname); // sadece eşleşen owner kayıtlarını getirir
   void create (Owner owner);
   Owner update(Owner owner); // güncellenen owner kaydını döndürücek
   void delete (Long id);
   
   
   
}
