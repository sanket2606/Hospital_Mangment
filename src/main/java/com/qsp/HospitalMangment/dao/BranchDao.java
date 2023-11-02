package com.qsp.HospitalMangment.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.HospitalMangment.dto.Branch;
import com.qsp.HospitalMangment.repo.BranchesRep;

@Repository
public class BranchDao
{
	private BranchesRep branchesRep;
	
	public Branch saveBranch(@RequestParam int hosptalid,@RequestParam  int addressid,@RequestBody  Branch branch) 
	{
		return service.saveBranch(hosptalid,addressid,branch) ;
		
	}

}
