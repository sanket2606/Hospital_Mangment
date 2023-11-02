package com.qsp.HospitalMangment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Branch;

@RestController
public class BranchesController 
{
	@Autowired
	private Service service;
	public Branch saveBranch(@RequestParam int hosptalid,@RequestParam  int addressid,@RequestBody  Branch branch) 
	{
		return service.saveBranch(hosptalid,addressid,branch) ;
		
	}

}
