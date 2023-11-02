package com.qsp.HospitalMangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dao.AddressDao;
import com.qsp.HospitalMangment.dto.Address;
import com.qsp.HospitalMangment.service.AddressService;
import com.qsp.HospitalMangment.util.ResponseStructure;

@RestController
@RequestMapping("/Address")
public class AddressController 
{
    @Autowired
	private AddressService addressService;
    
    @PostMapping
	public ResponseStructure<Address> saveAddress(@RequestBody Address address)
	{
		return addressService.saveAddress(address); 
		
	}
    
    @GetMapping
   	public ResponseStructure<Address> findAddressById(@RequestParam int id)
   	{
   		return addressService.findAddressById(id); 
   		
   	}
    @GetMapping("/City")
   	public List<Address> findAddressByCity(@RequestParam String city)
   	{
   		return addressService.findAddressByCity(city); 
   		
   	}
    @GetMapping("/Pincode")
   	public List<Address> findAddressByPinCode(@RequestParam int pincode)
   	{
   		return addressService.findAddressByPinCode(pincode); 
   		
   	}
    
    @GetMapping("/state")
   	public List<Address> findAddressBystate(@RequestParam String state)
   	{
   		return addressService.findAddressByCity(state); 
   		
   	}
    
    @PutMapping
    public ResponseStructure<Address> updateAddressById(@RequestParam int id,@RequestBody Address address )
   	{
   		return addressService.updateAddressById(id,address); 
   		
   	}
    @PutMapping("/city")
    public ResponseStructure<Address> updateAddressByCity(@RequestParam int id,@RequestParam String city)
   	{
    	System.out.println("Metrhod Excution start");
   		return addressService.updateAddressByCity(id, city); 
   		
   	}
    @PutMapping("/pincode")
    public ResponseStructure<Address> updateAddressByPincode(@RequestParam int id,@RequestParam int pincode)
   	{
   		return addressService.updateAddressBypincode(id,pincode); 
   		
   	}
	
    @PutMapping("/state")
    public ResponseStructure<Address> updateAddressBystate(@RequestParam int id,@RequestParam String state)
   	{
   	       return addressService.updateAddressBystate(id, state); 
   		
   	}
	
       
    @DeleteMapping ("/delete")
    public ResponseStructure<Address> deleteAddressBysidId(@RequestParam int id)
   	{
   	       return addressService.deleteAddressById(id);
   		
   	}
	
       
    
    
    
	

}
