package com.javaegitimleri.petclinic1.model;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)

public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="petClinicSeqGen")
	@SequenceGenerator(name="petClinicSeqGen", sequenceName="petclinic_sequence")
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@CreatedBy
	private String createdBy;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedBy
	private String updatedBy;
	
	@LastModifiedDate
	private Date updatedDate;
	
	
}
