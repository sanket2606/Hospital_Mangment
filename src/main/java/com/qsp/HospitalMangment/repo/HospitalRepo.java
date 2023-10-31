package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.HospitalMangment.dto.Hospital;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Integer> {

}
