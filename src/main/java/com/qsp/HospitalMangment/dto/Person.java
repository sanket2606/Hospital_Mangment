package com.qsp.HospitalMangment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personid;
	@NotBlank(message = "Name Can't blank")
	@NotNull(message = "Name Can't null")
	private String personname;
	@Min(value = 600000000l)
	@Max(value = 999999999l)
	private long personphone;
	@NotBlank(message = "Email Can't blank")
	@NotNull(message = "Email Can't null")
	@Email(regexp = "[a-z0-9._+$]+@[a-z0-9]+\\.[a-b]{2,3}",message = "invalidemail")
	private String personemail;
	@NotBlank(message = "Address Can't blank")
	@NotNull(message = "Address Can't null")
	private String personaddress;
	

}
