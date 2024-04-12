package com.question4.question4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question4.question4.model.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer>{

}
