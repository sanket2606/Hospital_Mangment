package com.qsp.HospitalMangment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class MedItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int meditemsid;
	private String meditemsname;
	private double meditemsprice;
	@ManyToOne
	private MedOrder medOrder;

}
