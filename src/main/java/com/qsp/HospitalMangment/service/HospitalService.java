package com.qsp.HospitalMangment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.qsp.HospitalMangment.dao.HospitalDao;
import com.qsp.HospitalMangment.dto.Hospital;

@Service
public class HospitalService {
	@Autowired
	private HospitalDao hospitalDao;
	
	public Hospital saveHospital(@RequestBody Hospital hospital)
	{
		return hospitalDao.saveHospital(hospital);
		
	}

}
