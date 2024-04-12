package com.question1.question1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question1.question1.model.Medicine;
import com.question1.question1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepo medicineRepo;

    public Medicine saveMedicine(Medicine m)
    {
        return medicineRepo.save(m);
    }
    public List<Medicine> showMedicine()
    {
        return medicineRepo.findAll();
    }

    public Optional<Medicine> showMedicineEach(int id)
    {
        return medicineRepo.findById(id);
    }
}
