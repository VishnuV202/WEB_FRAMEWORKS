package com.question2.question_5_2.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question2.question_5_2.model.Employee;
import com.question2.question_5_2.service.EmployeeService;



@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;
    public EmployeeController( EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }
    @PostMapping("/api/employee")
    public Employee postMethodName(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/api/employee/{employeeId}")
    public Employee putMethodName(@PathVariable("employeeId") int id, @RequestBody Employee employee) {
        return employeeService.updateDetails(id,employee);
    }
    
    @DeleteMapping("/api/employee/{employeeId}")
    public void delete(@PathVariable("employeeId") int id,@RequestBody Employee employee)
    {
        employeeService.deleteEmployee(id);
    }
}
