package com.qsp.HospitalMangment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Hospital;

@RestController
@RequestMapping("/hospital")
public class HospitalController 
{
	@Autowired
	private Service service;
	@GetMapping
	public Hospital saveHospital(@RequestBody Hospital hospital)
	{
		return service.saveHospital(hospital);
		
	}

}
