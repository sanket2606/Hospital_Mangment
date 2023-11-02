package com.qsp.HospitalMangment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dao.AddressDao;
import com.qsp.HospitalMangment.dto.Address;
import com.qsp.HospitalMangment.util.ResponseStructure;

@Service
public class AddressService
{
	@Autowired
	private AddressDao addressDao;
	private ResponseStructure<Address> Structure=new ResponseStructure();
	public ResponseStructure<Address> saveAddress(Address address)
	{
		Structure.setMessage("The Adress saved Succefully");
		Structure.setStatus(HttpStatus.CREATED.value());
		Structure.setData(addressDao.saveAddress(address));
		return Structure;
		
	}
	
	public ResponseStructure<Address> findAddressById(int id)
   	{
   		Address address=addressDao.findAddressById(id); 
   		if(address != null)
   		{
   			Structure.setMessage("The Adrress found Succefully");
   			Structure.setStatus(HttpStatus.FOUND.value());
   			Structure.setData(addressDao.saveAddress(address));
   			return Structure;
   		}
   		else
   		{
   			Structure.setMessage("The Adrress with given id not found");
   			Structure.setStatus(HttpStatus.NOT_FOUND.value());
   			Structure.setData(addressDao.saveAddress(address));
   			return Structure;
   		}
   		
   	}
       
    
	public List<Address> findAddressByCity(String city)
   	{
   		return addressDao.findAddressByCity(city); 
   		
   	}
	public List<Address> findAddressByPinCode(int pincode)
   	{
   		return addressDao.findAddressByPinCode(pincode); 
   		
   	}
	public List<Address> findAddressBystate(String state)
   	{
   		return addressDao.findAddressBystate(state); 
   		
   	}
	
	public ResponseStructure<Address> updateAddressById(int id,Address address)
   	{
   		Address address2= addressDao.updateAddressById(id,address); 
   		if(address2 != null)
   		{
   			Structure.setMessage("Address updated Succefully");
   			Structure.setStatus(HttpStatus.OK.value());
   			Structure.setData(address2);
   			return Structure;
   		}
   		else
   		{
   			Structure.setMessage("The Data is not found withe given id");
   			Structure.setStatus(HttpStatus.NOT_FOUND.value());
   			Structure.setData(address2);
   			return Structure;
   			
   		}
   		
   	}
	
	public ResponseStructure<Address> updateAddressByCity(int id,String city )
   	{
   		Address address= addressDao. updateAddressByCity(id,city );
   		if(address!=null)
   		{
   			Structure.setMessage("Address Updated Succefully");
   			Structure.setStatus(HttpStatus.OK.value());
   			Structure.setData(address);
   			return Structure;
   		}
   		else
   		{

   			Structure.setMessage("The Address is not found by id");
   			Structure.setStatus(HttpStatus.OK.value());
   			Structure.setData(address);
   			return Structure;
   		}
   		
   	}
	
	public ResponseStructure<Address> updateAddressBypincode(int id,int pincode )
   	{
   		Address address= addressDao. updateAddressByPincode(id,pincode );
   		if(address!=null)
   		{
   			Structure.setMessage("Address Updated Succefully");
   			Structure.setStatus(HttpStatus.OK.value());
   			Structure.setData(address);
   			return Structure;
   		}
   		else
   		{

   			Structure.setMessage("The Address is not found by given id");
   			Structure.setStatus(HttpStatus.NOT_FOUND.value());
   			Structure.setData(address);
   			return Structure;
   		}
   		
   	}
	
	
   public ResponseStructure<Address> updateAddressBystate(int id,String state) 
   {
	   Address address= addressDao.updateAddressBystate(id,state) ;
	   if(address!=null)
  		{
  			Structure.setMessage("Address Updated Succefully");
  			Structure.setStatus(HttpStatus.OK.value());
  			Structure.setData(address);
  			return Structure;
  		}
  		else
  		{

  			Structure.setMessage("The Address is not found by given id");
  			Structure.setStatus(HttpStatus.NOT_FOUND.value());
  			Structure.setData(address);
  			return Structure;
  		}
  		
	
   }    
   
   public ResponseStructure<Address> deleteAddressById(int id) 
   {
	   Address address= addressDao.deleteAddressBystate(id);
	   if(address!=null)
  		{
  			Structure.setMessage("Address Delete Succefully");
  			Structure.setStatus(HttpStatus.OK.value());
  			Structure.setData(address);
  			return Structure;
  		}
  		else
  		{

  			Structure.setMessage("The Address is not found by given id");
  			Structure.setStatus(HttpStatus.NOT_FOUND.value());
  			Structure.setData(address);
  			return Structure;
  		}
  		
	
   }    


}
