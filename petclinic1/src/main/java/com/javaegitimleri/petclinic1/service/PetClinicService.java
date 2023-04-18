package com.javaegitimleri.petclinic1.service;

import java.util.List;

import javax.validation.Valid;

import com.javaegitimleri.petclinic1.exception.OwnerNotFoundException;
import com.javaegitimleri.petclinic1.exception.VetNotFoundException;
import com.javaegitimleri.petclinic1.model.Owner;
import com.javaegitimleri.petclinic1.model.Vet;

// bu arayüz içinde Owner ve pet nesneleri ile ilgili iş mantığı içerien işlemleri tanımlayacağız.

public interface PetClinicService {
List<Owner> findOwners();
List<Owner> findOwners(String lastName);
Owner findOwner (Long id) throws OwnerNotFoundException; // id ile eşleşen bir owner kaydı varsa onu dönücek yoksa hata fırlatıcak 
void createOwner (@Valid Owner owner);
void update (Owner owner);
void deleteOwner(Long id);

List<Vet> findVets();

Vet findVet(Long id) throws VetNotFoundException;

}
