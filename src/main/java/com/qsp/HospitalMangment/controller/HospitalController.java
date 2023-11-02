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
import com.qsp.HospitalMangment.util.ResponseStructure;

@RestController
@RequestMapping("/hospital")
public class HospitalController 
{
	@Autowired
	private HospitalService service;
	@PostMapping
	public ResponseStructure<Hospital>  saveHospital(@RequestBody Hospital hospital)
	{
		return  service.saveHospital(hospital);
		
	}

	@PutMapping
	public ResponseStructure<Hospital> updateHospital(@RequestParam int id,@RequestBody Hospital hospital)
	{
		return  service.updateHospital(id,hospital);
		
	}
	
	@GetMapping
	public ResponseStructure<Hospital> findHospitalById(@RequestParam int id)
	{
		return  service.findHospitalById(id);
		
	}
	
	@GetMapping("/Email/{email}")
	public ResponseStructure<Hospital> findHospitalByEmail(@PathVariable String email)
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
	public ResponseStructure<Hospital> updateHospitalName(@RequestParam int id,@RequestParam String name)
	{
		return  service.updateHospitalName(id,name);
		
	}
	@PatchMapping("/updateEmail")
	public ResponseStructure<Hospital> updateHospitalEmail(@RequestParam int id,@RequestParam String email)
	{
		return  service.updateHospitalEmail(id,email);
		
	}
	
	@PatchMapping("/updateCEO")
	public ResponseStructure<Hospital> updateHospitalCEO(@RequestParam int id,@RequestParam String ceo)
	{
		return  service.updateHospitalCEO(id,ceo);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseStructure<Hospital> deleteHospitalById(@RequestParam int id)
	{
		return  service.deleteHospitalById(id);
		
	}
	

	@DeleteMapping("/deleteEmail")
	public ResponseStructure<Hospital> deleteHospitalByEmail(@RequestParam String  email)
	{
		return  service.deleteHospitalByEmail(email);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

