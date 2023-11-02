package com.qsp.HospitalMangment.service;

import java.util.List;

import javax.rmi.CORBA.Stub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dao.HospitalDao;
import com.qsp.HospitalMangment.dto.Hospital;
import com.qsp.HospitalMangment.util.ResponseStructure;

@Service
public class HospitalService {
	@Autowired
	private HospitalDao hospitalDao;
	
	
	ResponseStructure<Hospital> structure = new ResponseStructure();
	public ResponseStructure<Hospital> saveHospital(Hospital hospital)
	{
		
		structure.setMessage("Hospital Saved Succefully");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(hospitalDao.saveHospital(hospital));
		return structure;
		
	}
	public ResponseStructure<Hospital> updateHospital(int id,Hospital hospital)
	{
		Hospital hospitaldb =hospitalDao.updateHospital(id,hospital);
		if(hospitaldb!=null)
		{
			structure.setMessage("Hospital Updated Succefully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospitaldb);
			return structure;
		}
		else
		{
		    structure.setMessage("Hospital Not Updated");
		    structure.setStatus(HttpStatus.NOT_FOUND.value());
		    structure.setData(hospitaldb);
		    return structure;
		}
		 
		
	}
	
	public ResponseStructure<Hospital> findHospitalById(int id)
	{
		Hospital hospital=hospitalDao.findHospitalById(id);
		if(hospital!=null)
		{
			structure.setMessage("Hospital Found Successfully");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(hospital);
			return structure ;
		}
		else
		{
			structure.setMessage("Hospital Not Found");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(hospital);
			return structure ;
		}
		
		
	}
	
	

	public ResponseStructure<Hospital> findHospitalByEmail(String email)
	{
		
		
		Hospital hospital= hospitalDao.findHospitalByEmail(email);
		if(hospital != null)
		{
			structure.setMessage("Hospital found Succefully by using Email");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);
			return structure;
		}
		else
		{
			structure.setMessage("Hospital Not Found By Using Email");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(hospital);
			return structure;
		}
		
	}
	
	//Pending
	public List<Hospital> findHospitalByName(String name)
	{
		
		return  hospitalDao.findHospitalByName(name);
		
	}
	
	public List<Hospital> findHospitalByCEO(String ceo)
	{
		return  hospitalDao.findHospitalByCEO(ceo);
		
	}
	public ResponseStructure<Hospital> updateHospitalName(int id,String name)
	{
		Hospital hospital=  hospitalDao.updateHospitalName(id,name);
		if(hospital != null)
		{
			structure.setMessage("Hospita Data Updates Succefully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);
			return structure;
		}
		else
		{
			structure.setMessage("Hospita Data Not Updates");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(hospital);
			return structure;
		}
		
	}	
	
	public ResponseStructure<Hospital> updateHospitalEmail(int id,String email)
	{
		Hospital hospital=  hospitalDao.updateHospitalEmail(id,email);
		if(hospital != null)
		{
			structure.setMessage("Hospita Data Updates Email");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);
			return structure;
		}
		else
		{
			structure.setMessage("The Data is Not present With given id ");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);	
			return structure; 
		}
		
	}
	public ResponseStructure<Hospital> updateHospitalCEO(int id, String ceo)
	{
		Hospital hospital=  hospitalDao.updateHospitalCEO(id,ceo);
		if (hospital != null)
		{
			structure.setMessage("Hospital Data Updated Succefully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);	
			return structure; 
			
		}
		else
		{
			structure.setMessage("The Data is Not present With given id");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(hospital);	
			return structure; 
		}
		
	}
	
	public ResponseStructure<Hospital> deleteHospitalById(int id)
	{
		Hospital hospital= hospitalDao.deleteHospitalById(id);
		if(hospital != null)
		{
			structure.setMessage("Hospital Data Delete Succusfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);
			hospitalDao.findHospitalById(id);
			return structure;
		}
		else
		{
			structure.setMessage("The Data is Not present With given id");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(hospital);
			hospitalDao.findHospitalById(id);
			return structure;
			
		}
		
	}
	
	public ResponseStructure<Hospital> deleteHospitalByEmail(String  email)
 	{
 		Hospital hospital=  hospitalDao.deleteHospitalByEmail(email);
 		if(hospital != null)
		{
			structure.setMessage("Hospital Data Delete Succusfully");
			structure.setStatus(HttpStatus.OK.value());
			structure.setData(hospital);
			hospitalDao.deleteHospitalByEmail(email);
			return structure;
		}
		else
		{
			structure.setMessage("The Data is Not present With given id");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
			structure.setData(hospital);
			return structure;
			
		}
 		
 	}
	
	

}
