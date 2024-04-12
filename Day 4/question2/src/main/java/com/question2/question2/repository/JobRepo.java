package com.question2.question2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question2.question2.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer>{

    
}