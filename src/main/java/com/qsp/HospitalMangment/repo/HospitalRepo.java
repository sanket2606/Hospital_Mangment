package com.qsp.HospitalMangment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Hospital;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Integer> {
	
	Hospital findHospitalByhospitalemail(String email);
	List<Hospital> findHospitalByhospitalname(String name);
	List<Hospital> findHospitalByhospitalCEO(String ceo);
	

}
