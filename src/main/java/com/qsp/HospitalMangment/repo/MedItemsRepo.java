package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.HospitalMangment.dto.MedItems;

@Repository
public interface MedItemsRepo extends JpaRepository<MedItems, Integer> {

}
