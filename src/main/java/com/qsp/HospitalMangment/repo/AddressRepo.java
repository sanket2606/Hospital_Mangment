package com.qsp.HospitalMangment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
	
	List<Address> findAddressByCity(String city);
	List<Address> findAddressBypincode(int pincode);
	List<Address> findAddressBystate(String state);
   	

}
