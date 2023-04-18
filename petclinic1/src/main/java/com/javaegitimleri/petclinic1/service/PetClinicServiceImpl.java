package com.javaegitimleri.petclinic1.service;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.javaegitimleri.petclinic1.dao.OwnerRepository;
import com.javaegitimleri.petclinic1.dao.PetRepository;
import com.javaegitimleri.petclinic1.dao.jpa.VetRepository;
import com.javaegitimleri.petclinic1.exception.OwnerNotFoundException;
import com.javaegitimleri.petclinic1.model.Owner;
import com.javaegitimleri.petclinic1.model.Vet;
@Validated
@Service // bu anotasyon spring conteiner'ın ilgili sınıfftan bir tane bean yaratmasını sağlıyıcak
@Transactional(rollbackFor=Exception.class)  // sınıf düzeyinde kullandık tüm public metotlar transaction olacak
public class PetClinicServiceImpl implements PetClinicService {

	private OwnerRepository ownerRepository;
	
	private PetRepository petRepository;
	
	@Autowired
	private JavaMailSender mailSender;
	
	private VetRepository vetRepository;
	
	@Autowired
	public void setVetRepository(VetRepository vetRepository) {
		this.vetRepository=vetRepository;
	}
	
	@Autowired // owner repository tipindeki bir bean'i petclinic service içerisinde bu setter metodu sayesinde enjekte edecek.
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	
	@Autowired
	public void setPetRepository(PetRepository petRepository) {
		this.petRepository=petRepository;
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	
	@Secured(value= {"ROLE_USER","ROLE_EDITOR"})
	public List<Owner> findOwners() {
	
		return ownerRepository.findAll();
				
	}

	@Override
    @Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public List<Owner> findOwners(String lastName) {
	return ownerRepository.findByLastName(lastName);
	}

	@Override
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Owner findOwner(Long id) throws OwnerNotFoundException {

		Owner owner = ownerRepository.findById(id);
		if(owner==null)throw new OwnerNotFoundException("Owner not found with id :" + id);
		return owner;
	}

	@Override
	@CacheEvict(cacheNames="allOwners",allEntries=true) // allOwners daki bütün değerler remove edilecek 
	public void createOwner(@Valid Owner owner) {
		ownerRepository.create(owner);
       
		SimpleMessage msg = new SimpleMailMessage();
		 msg.setForm("k@s");
		 msg.setTo("m@y");
		 msg.setSubject("Owner created !");
		 msg.setText("Owner entity with id :" +owner.getId() + "created succesfully");
		 
		 mailSender.send(msg);
		
	}

	@Override
	public void update(Owner owner) {
		ownerRepository.update(owner);

	}

	@Override
	public void deleteOwner(Long id) {
		petRepository.deleteByOwnerId(id);
	   ownerRepository.delete(id);
	   
	   //if(true) throw new RuntimeException("testing rollback");

	   
	   
	}

	   @Override 
	   public List<Vet> findVets() {
		   return vetRepository.findAll();
	   }
	   
	   @Override 
	   public Vet findVet(Long id) throws VetNotFoundExcepiton {
		   
		   return vetRepository.findById(id).orElseThrow(()->{return new VetNotFoundExcepiton("Vet not found by id :" + id);});
	   }
	   

}
