package com.qsp.HospitalMangment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Address;
import com.qsp.HospitalMangment.service.AddressService;

@RestController
@RequestMapping("/Address")
public class AddressController 
{
    @Autowired
	private AddressService addressService;
    
    @PostMapping
	public Address saveAddress(@RequestBody Address address)
	{
		return addressService.saveAddress(address); 
		
	}
    
    
	

}
