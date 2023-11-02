package com.qsp.HospitalMangment.util;

import java.util.List;

import com.qsp.HospitalMangment.dto.Address;

import lombok.Data;

@Data
public class ResponseStructure <T>{
	
	private String message;
	private int status;
	private T data;
	

}
