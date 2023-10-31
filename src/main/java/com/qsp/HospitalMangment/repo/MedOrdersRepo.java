package com.qsp.HospitalMangment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.HospitalMangment.dto.MedOrder;

@Repository
public interface MedOrdersRepo  extends JpaRepository<MedOrder, Integer>{

}
