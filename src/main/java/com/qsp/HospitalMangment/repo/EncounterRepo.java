package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.HospitalMangment.dto.Encounter;
@Repository
public interface EncounterRepo extends JpaRepository<Encounter, Integer> {

}
