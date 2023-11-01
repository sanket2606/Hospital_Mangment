package com.qsp.HospitalMangment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dao.HospitalDao;
import com.qsp.HospitalMangment.dto.Hospital;

@Service
public class HospitalService {
	@Autowired
	private HospitalDao hospitalDao;
	
	public Hospital saveHospital(Hospital hospital)
	{
		return hospitalDao.saveHospital(hospital);
		
	}
	public Hospital updateHospital(int id,Hospital hospital)
	{
		return  hospitalDao.updateHospital(id,hospital);
		
	}
	
	public Hospital findHospitalById(int id)
	{
		return  hospitalDao.findHospitalById(id);
		
	}
	
	

	public Hospital findHospitalByEmail(String email)
	{
		return  hospitalDao.findHospitalByEmail(email);
		
	}
	
	public List<Hospital> findHospitalByName(String name)
	{
		System.out.println("Service"+name);
		return  hospitalDao.findHospitalByName(name);
		
	}
	
	public List<Hospital> findHospitalByCEO(String ceo)
	{
		return  hospitalDao.findHospitalByCEO(ceo);
		
	}
	public Hospital updateHospitalName(@RequestParam int id,@RequestParam String name)
	{
		return  hospitalDao.updateHospitalName(id,name);
		
	}
	public Hospital updateHospitalEmail(int id,String email)
	{
		return  hospitalDao.updateHospitalEmail(id,email);
		
	}
	public Hospital updateHospitalCEO(@RequestParam int id,@RequestParam String ceo)
	{
		return  hospitalDao.updateHospitalCEO(id,ceo);
		
	}
	
	

}
