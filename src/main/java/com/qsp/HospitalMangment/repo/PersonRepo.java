package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.HospitalMangment.dto.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
