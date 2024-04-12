package com.question2.question2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question2.question2.model.Job;
import com.question2.question2.repository.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo jr;

    public Job saveJob(Job job)
    {
        return jr.save(job);
    }
    public List<Job> showJob()
    {
        return jr.findAll();
    }
    public Optional<Job> showJobEach(int id)
    {
        return jr.findById(id);
    }
}
