package com.qsp.HospitalMangment.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.qsp.HospitalMangment.dto.Address;
import com.qsp.HospitalMangment.repo.AddressRepo;

@Repository
public class AddressDao
{
	@Autowired
	private AddressRepo addressRepo;
	
	public Address saveAddress(@RequestBody Address address)
	{
		return addressRepo.save(address); 
		
	}
	

}
