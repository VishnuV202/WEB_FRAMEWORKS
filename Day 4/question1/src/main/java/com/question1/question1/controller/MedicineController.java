
package com.question1.question1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question1.question1.model.Medicine;
import com.question1.question1.service.MedicineService;

@RestController
public class MedicineController {
    @Autowired
    MedicineService medservice;
    @PostMapping(path = "/api/medicine")
    public Medicine getmMedicine(@RequestBody Medicine medicine)
    {
        return medservice.saveMedicine(medicine);

    }

    @GetMapping("/api/medicines")
    public List<Medicine> getmeds()
    {
        return medservice.showMedicine();
    }

    @GetMapping("/api/medicine/{medicineId}")
    public Optional<Medicine> getmets(@PathVariable int medicineId)
    {
       return medservice.showMedicineEach(medicineId);
    }
}
