package com.javaegitimleri.petclinic1.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaegitimleri.petclinic1.model.Vet;

public interface VetRepository extends JpaRepository <Vet,Long> {

}
