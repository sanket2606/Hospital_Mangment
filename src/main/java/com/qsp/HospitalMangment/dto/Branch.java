package com.qsp.HospitalMangment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Data
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchid;
	private String branchname;
	private String manager;
	@ManyToOne
	private Hospital hospital;
	@OneToOne
	private Address address;
	
	

}
