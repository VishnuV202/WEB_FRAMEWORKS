package com.question1.question1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int medicineid;
    String medicineName;
    String medicineFor;
    String medicineBrand;
    String manufacturedIn;
    double medicinePrice;
    String expiryDate;
    public Medicine(int medicineid, String medicineName, String medicineFor, String medicineBrand,
            String manufacturedIn, double medicinePrice, String expiryDate) {
        this.medicineid = medicineid;
        this.medicineName = medicineName;
        this.medicineFor = medicineFor;
        this.medicineBrand = medicineBrand;
        this.manufacturedIn = manufacturedIn;
        this.medicinePrice = medicinePrice;
        this.expiryDate = expiryDate;
    }
    public Medicine() {
    }
    public int getMedicineid() {
        return medicineid;
    }
    public void setMedicineid(int medicineid) {
        this.medicineid = medicineid;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getMedicineBrand() {
        return medicineBrand;
    }
    public void setMedicineBrand(String medicineBrand) {
        this.medicineBrand = medicineBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public double getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
}
