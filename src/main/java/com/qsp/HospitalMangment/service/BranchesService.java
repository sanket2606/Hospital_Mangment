package com.qsp.HospitalMangment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dao.AddressDao;
import com.qsp.HospitalMangment.dao.BranchDao;
import com.qsp.HospitalMangment.dao.HospitalDao;
import com.qsp.HospitalMangment.dto.Address;
import com.qsp.HospitalMangment.dto.Branch;
import com.qsp.HospitalMangment.dto.Hospital;
import com.qsp.HospitalMangment.util.ResponseStructure;

@Service
public class BranchesService 
{
	@Autowired
	private BranchDao branchDao;
	@Autowired
	private HospitalDao hospitalDao;
	@Autowired
	private AddressDao addressDao;

	 ResponseStructure<Branch> structure = new  ResponseStructure<>();
	public ResponseStructure<Branch> saveBranch(int hosptalid,int addressid,Branch branch) 
	{
		branch.setHospital(hospitalDao.findHospitalById(hosptalid));
		branch.setAddress(addressDao.findAddressById(addressid));
		 
			 structure.setMessage("Branch Saved Succefully");
			 structure.setStatus(HttpStatus.CREATED.value());
			 structure.setData(branchDao.saveBranch(branch));
			 return structure;
	}
	
	public ResponseStructure<Branch>  findBranchById(int id) 
	{
		Branch branch= branchDao.findBranchById(id) ;
		if(branch != null)
		{
			structure.setMessage("Branch data found Succefully");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(branch);
			return structure;
			
		}
		else
		{
			structure.setMessage("Branch data Not found");
			structure.setStatus(HttpStatus.FOUND.value());
			structure.setData(branch);
			return structure;
		}
		
	}
	
	public  List<Branch> findBranchByManager(@RequestParam String manager) 
	{
		return branchDao.findBranchByManager(manager) ;
		
	}
	

}
