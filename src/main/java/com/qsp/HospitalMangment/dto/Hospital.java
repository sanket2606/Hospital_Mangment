package com.qsp.HospitalMangment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@Entity
@Data

public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalid;
	private String hospitalname;
	private String hospitalemail;
	private String hospitalCEO;
	

}
