package com.qsp.HospitalMangment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.qsp.HospitalMangment.dto.Hospital;
import com.qsp.HospitalMangment.repo.HospitalRepo;

@Repository
public class HospitalDao {
	
	@Autowired
	private HospitalRepo hospitalRepo;
	
	public Hospital saveHospital(@RequestBody Hospital hospital)
	{
		return hospitalRepo.save(hospital);
		
	}

}
