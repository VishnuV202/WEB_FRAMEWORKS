package com.hospital.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.model.HospitalDetails;

@Repository
public interface HospitalRepo extends JpaRepository<HospitalDetails,Integer> {

}
