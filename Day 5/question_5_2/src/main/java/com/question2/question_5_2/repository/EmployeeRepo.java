package com.question2.question_5_2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question2.question_5_2.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}
