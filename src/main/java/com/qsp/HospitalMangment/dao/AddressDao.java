package com.qsp.HospitalMangment.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dto.Address;
import com.qsp.HospitalMangment.repo.AddressRepo;
import com.qsp.HospitalMangment.util.ResponseStructure;

@Repository
public class AddressDao
{
	@Autowired
	private AddressRepo addressRepo;
	
	public Address saveAddress(@RequestBody Address address)
	{
		return addressRepo.save(address); 
		
	}
	public Address findAddressById(@RequestParam int id)
   	{
   		 Optional<Address> optional=addressRepo.findById(id);
   		  if(optional.isPresent())
   		  {
   			  return optional.get();
   		  }
   		  else
   		  {
   			  return null;
   		  }
   		
   	}
	
	
	public List<Address> findAddressByCity(@PathVariable String city)
   	{
   		return addressRepo.findAddressByCity(city); 
   		
   	}
	public List<Address> findAddressByPinCode(int pincode)
   	{
   		return addressRepo.findAddressBypincode(pincode); 
   		
   	}
	
	public List<Address> findAddressBystate(@RequestParam String state)
   	{
   		return addressRepo.findAddressBystate(state); 
   		
   	}

	public Address updateAddressById(int id,Address address)
   	{
   		Optional<Address> optional = addressRepo.findById(id); 
   		
   		if(optional.isPresent())
   		{
   			address.setPincode(optional.get().getPincode());
   			addressRepo.save(address);
   			return address;
   		}
   		else
   		{
   			return null;
   		}
   		
   	}
	public Address updateAddressByCity(int id,String city)
   	{
        Optional<Address> optional = addressRepo.findById(id); 
   		
   		if(optional.isPresent())
   		{
   			optional.get().setCity(city);
   			addressRepo.save(optional.get());
   			return optional.get();
   		}
   		else
   		{
   			return null;
   		}
   		
   		
   	}
	
	public Address  updateAddressByPincode(int id,int pincode)
   	{
        Optional<Address> optional = addressRepo.findById(id); 
   		
   		if(optional.isPresent())
   		{
   			optional.get().setPincode(pincode);
   			addressRepo.save(optional.get());
   			return optional.get();
   		}
   		else
   		{
   			return null;
   		}
   		
   		
   	}
	 public Address updateAddressBystate(int id,String state) 
	  {
		 Optional<Address> optional = addressRepo.findById(id); 
	   		
	   		if(optional.isPresent())
	   		{
	   			optional.get().setState(state);
	   			addressRepo.save(optional.get());
	   			return optional.get();
	   		}
	   		else
	   		{
	   			return null;
	   		}
		   
		
	  }    

	
	
	 public Address deleteAddressBystate(int id) 
	  {
		 Optional<Address> optional = addressRepo.findById(id); 
	   		
	   		if(optional.isPresent())
	   		{
	   			Address address=optional.get();
	   			addressRepo.delete(optional.get());
	   			return optional.get();
	   		}
	   		else
	   		{
	   			return null;
	   		}
		   
		
	  }    
	

}
