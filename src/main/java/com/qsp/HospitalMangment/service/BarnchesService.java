package com.qsp.HospitalMangment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.HospitalMangment.dao.BranchDao;
import com.qsp.HospitalMangment.dto.Branch;

@Service
public class BarnchesService 
{
	@Autowired
	private BranchDao branchDao;
	public Branch saveBranch(int hosptalid,int addressid,Branch branch) 
	{
		return branchDao.saveBranch(hosptalid,addressid,branch) ;
		
	}

}
