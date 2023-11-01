package com.qsp.HospitalMangment.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int encounterid;
	private String cause;
	private double cost;
	@ManyToOne
	private Person person;
	@OneToMany
	List<Branch> branchs;
	

}
