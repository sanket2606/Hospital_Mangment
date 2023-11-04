package com.qsp.HospitalMangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Branch;
import com.qsp.HospitalMangment.service.BranchesService;
import com.qsp.HospitalMangment.util.ResponseStructure;

@RestController
@RequestMapping("/Branch")
public class BranchesController 
{
	@Autowired
	private BranchesService branchesService ;
	@PostMapping
	public ResponseEntity saveBranch(@RequestParam int hosptalid,@RequestParam  int addressid,@RequestBody  Branch branch) 
	{
		return branchesService.saveBranch(hosptalid, addressid, branch);
		
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Branch>>  findBranchById(@RequestParam int id) 
	{
		return branchesService.findBranchById(id) ;
		
	}
	@GetMapping("/Manager")
	public ResponseStructure<List<Branch>>  findBranchByManager(@RequestParam String manager) 
	{
		return branchesService.findBranchByManager(manager) ;
		
	}
	
	
	
	

}
