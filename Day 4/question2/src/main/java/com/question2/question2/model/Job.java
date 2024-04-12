package com.question2.question2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int jobId;
    int minSalray,maxSalary;
    String jobTitle,jobDescription;
    public Job(int jobId, int minSalray, int maxSalary, String jobTitle, String jobDescription) {
        this.jobId = jobId;
        this.minSalray = minSalray;
        this.maxSalary = maxSalary;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }
    public Job() {
    }
    public int getJobId() {
        return jobId;
    }
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    public int getMinSalray() {
        return minSalray;
    }
    public void setMinSalray(int minSalray) {
        this.minSalray = minSalray;
    }
    public int getMaxSalary() {
        return maxSalary;
    }
    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    

}
