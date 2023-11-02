package com.qsp.HospitalMangment.dao;

import java.util.List;
import java.util.Optional;import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dto.Hospital;
import com.qsp.HospitalMangment.repo.HospitalRepo;

@Repository
public class HospitalDao {
	
	@Autowired
	private HospitalRepo hospitalRepo;
	
	public Hospital saveHospital(Hospital hospital)
	{
		return hospitalRepo.save(hospital);
		
	}
	
	public Hospital findHospitalById(@RequestParam int id)
	{
		Optional<Hospital> optional=hospitalRepo.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			return null;
		}
		
	}
	public Hospital updateHospital(int id, Hospital hospital)
	{
		Optional< Hospital> optional=hospitalRepo.findById(id);
		if(optional.isPresent())
		{
			hospital.setHospitalid(optional.get().getHospitalid());
			return hospitalRepo.save(hospital);
		}
		else
		{
			return null;
		}
		
	}
	public Hospital findHospitalByEmail(String email)
	{
		return  hospitalRepo.findHospitalByhospitalemail(email);
		
		
	}
	public List<Hospital> findHospitalByName(String name)
	{
		
		return  hospitalRepo.findHospitalByhospitalname(name);
		
	}
	public List<Hospital> findHospitalByCEO(String ceo)
	{
		return  hospitalRepo.findHospitalByhospitalCEO(ceo);

		
	}
	
	public Hospital updateHospitalName( int id,String name)
	{
		Optional<Hospital> optional=hospitalRepo.findById(id);
		if(optional.isPresent())
		{
			
			optional.get().setHospitalname(name);
			hospitalRepo.save(optional.get());
			return  optional.get();
		}
		else
		{
			return null;
		}
	}
	
	
	 public Hospital updateHospitalEmail(int id,String email)
	  {
		 Optional<Hospital> optional= hospitalRepo.findById(id);
		 if(optional.isPresent())
		 {
			 optional.get().setHospitalemail(email);
			 hospitalRepo.save(optional.get());
			 return  optional.get();
			 
		 }
		 else
		 {
			 return null;
		 }		
	}
	 
	     public Hospital updateHospitalCEO(int id,String ceo)
		{
		   Optional<Hospital> optional= hospitalRepo.findById(id);
		   if(optional.isPresent())
		   {
			   optional.get().setHospitalCEO(ceo);
			   hospitalRepo.save(optional.get());
			   return optional.get();   
		   }
		   else
		   {
			   return null;
		   }
			
		}
	     
	     public Hospital deleteHospitalById(@RequestParam int id)
	 	{
	 		Optional<Hospital> optional = hospitalRepo.findById(id);
	 		if(optional.isPresent())
	 		{
	 			Hospital hospital = optional.get();
	 			hospitalRepo.delete(optional.get());
	 		   return hospital;
	 		}
	 		else
	 		{
	 			return null;
	 		}
	 	}
	     
	     public Hospital deleteHospitalByEmail(@RequestParam String  email)
	  	{
	  		Hospital hospital = hospitalRepo.findHospitalByhospitalemail(email);
	  		if(hospital != null)
	  		{
	  			hospitalRepo.delete(hospitalRepo.findHospitalByhospitalemail(email));
	  			return hospital;
	  		}
	  		else
	  		{
	  			return null;
	  		}
	  		
	  	}
	 	
	 	
	    
	 	
	


}
