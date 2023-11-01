package com.qsp.HospitalMangment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.qsp.HospitalMangment.dao.AddressDao;
import com.qsp.HospitalMangment.dto.Address;

@Service
public class AddressService
{
	@Autowired
	private AddressDao addressDao;
	public Address saveAddress(@RequestBody Address address)
	{
		return addressDao.saveAddress(address); 
		
	}
	


}
