package com.qsp.HospitalMangment.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dto.Branch;
import com.qsp.HospitalMangment.repo.BranchesRep;

@Repository
public class BranchDao
{
	@Autowired
	private BranchesRep branchesRep;
	
	public Branch saveBranch(Branch branch) 
	{
		return branchesRep.save(branch);
		
	}
	public Branch  findBranchById( int id) 
	{
	   Optional<Branch> optional= branchesRep.findById(id) ;
	   if(optional.isPresent())
	   {
		   return optional.get();
	   }
	   else
	   {
		   return null;
	   }
	   
		
	}
	

	public List<Branch> findBranchByManager(String manager) 
	{
		return branchesRep.findBranchByManager(manager) ;
		
	}
	

}
