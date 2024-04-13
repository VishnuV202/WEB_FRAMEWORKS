package com.question2.question_5_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question2.question_5_2.model.Employee;
import com.question2.question_5_2.repository.EmployeeRepo;


@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepo employeeRepo;
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }
    public Employee updateDetails(int id,Employee employee)
    {   
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(int id)
    {
        employeeRepo.deleteById(id);
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
