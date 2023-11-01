package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
