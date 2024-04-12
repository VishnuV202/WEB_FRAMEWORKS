package com.question4.question4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question4.question4.model.Patient;
import com.question4.question4.repository.PatientRepo;

@Service
public class PatientService 
{
    @Autowired
    PatientRepo PR;

    public Patient store(Patient P)
    {
        return PR.save(P);
    }

    public List<Patient> getAllDatas()
    {
        return PR.findAll();
    }

    public Optional<Patient> getById(int id)
    {
        return PR.findById(id);
    }
}
