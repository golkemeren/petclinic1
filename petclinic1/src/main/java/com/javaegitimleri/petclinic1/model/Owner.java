package com.javaegitimleri.petclinic1.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@Entity
@Table(name="t_owner")
@XmlRootElement  // kayıtlarımızı Xml formatında göstermek için kullanırız.
public class Owner extends BaseEntity {
  
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="petClinicSeqGen")
	@SequenceGenerator(name="petClinicSeqGen", sequenceName="petclinic_sequence")
	private Long id;
	@NotEmpty
	@Column(name="first_name")
   private String firstName;
	
	@NotEmpty
	@Column(name="last_name")
   private String lastName;
	
	@OneToMany(mappedBy="owner")
   private Set<Pet> pets = new HashSet<>();
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

@XmlTransient // sonsuz döngüye girilmemesi adına yaptık bu işlemi 
@JsonIgnore   //Json için hariç bırakma işlemini gerçekleştirebilmemiz için 
public Set<Pet> getPets() {
	return pets;
}
public void setPets(Set<Pet> pets) {
	this.pets = pets;
}
@Override
public String toString() {
	return "Owner [id=" + getId() + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}
   
	
}
