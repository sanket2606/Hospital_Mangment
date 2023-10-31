package com.qsp.HospitalMangment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personid;
	private String personname;
	private long personphone;
	private String personemail;
	private String personaddress;
	

}
