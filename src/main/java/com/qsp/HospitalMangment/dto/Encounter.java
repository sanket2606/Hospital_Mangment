package com.qsp.HospitalMangment.dto;

import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Encounter {
	private int encounterid;
	private String cause;
	private double cost;
	@ManyToOne
	private Person person;
	@OneToMany
	List<Branch> branchs;
	

}
