package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedItems extends JpaRepository<MedItems, Integer> {

}
