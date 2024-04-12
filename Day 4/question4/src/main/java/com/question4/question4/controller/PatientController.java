package com.question4.question4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question4.question4.model.Patient;
import com.question4.question4.service.PatientService;

@RestController
public class PatientController 
{
    @Autowired
    PatientService PS;

    @PostMapping("/api/patient")
    public Patient postpatient(@RequestBody Patient P)
    {
        return PS.store(P);
    }

    @GetMapping("/api/patient")
    public List<Patient> getAlldatas()
    {
        return PS.getAllDatas();
    }

    @GetMapping("/api/patient/{patientId}")
    public Optional<Patient> getByid(@PathVariable int id)
    {
        return PS.getById(id);
    }
}
