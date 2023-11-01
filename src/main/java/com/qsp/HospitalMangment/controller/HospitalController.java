package com.qsp.HospitalMangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Hospital;
import com.qsp.HospitalMangment.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController 
{
	@Autowired
	private HospitalService service;
	@PostMapping
	public Hospital saveHospital(@RequestBody Hospital hospital)
	{
		return  service.saveHospital(hospital);
		
	}

	@PutMapping
	public Hospital updateHospital(@RequestParam int id,@RequestBody Hospital hospital)
	{
		return  service.updateHospital(id,hospital);
		
	}
	
	@GetMapping
	public Hospital findHospitalById(@RequestParam int id)
	{
		return  service.findHospitalById(id);
		
	}
	
	@GetMapping("/Email/{email}")
	public Hospital findHospitalByEmail(@PathVariable String email)
	{
		return  service.findHospitalByEmail(email);
		
	}
	
	@GetMapping("/Name/{name}")
	public List<Hospital> findHospitalByName(@PathVariable String name)
	{
		System.out.println("Controller"+name);
		return  service.findHospitalByName(name);
		
		
	}
	
	@GetMapping("/CEO/{ceo}")
	public List<Hospital> findHospitalByCEO(@PathVariable String ceo)
	{
		return  service.findHospitalByCEO(ceo);
		
	}
	
	@PatchMapping("/updateName")
	public Hospital updateHospitalName(@RequestParam int id,@RequestParam String name)
	{
		return  service.updateHospitalName(id,name);
		
	}
	@PatchMapping("/updateEmail")
	public Hospital updateHospitalEmail(@RequestParam int id,@RequestParam String email)
	{
		return  service.updateHospitalEmail(id,email);
		
	}
	
	@PatchMapping("/updateCEO")
	public Hospital updateHospitalCEO(@RequestParam int id,@RequestParam String ceo)
	{
		return  service.updateHospitalCEO(id,ceo);
		
	}
	
	@DeleteMapping("/delete")
	public Hospital daeleteHospitalById(@RequestParam int id)
	{
		return  service.daeleteHospitalById(id);
		
	}
	
	@DeleteMapping("/deleteByName")
	public List<Hospital> deleteHospitalByName(@RequestParam String name)
	{
		System.out.println("Start");
		return  service.daleteHospitalByName(name);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

