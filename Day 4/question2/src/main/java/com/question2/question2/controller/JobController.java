package com.question2.question2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question2.question2.model.Job;
import com.question2.question2.service.JobService;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping(path="/api/job")
    public Job getJob(@RequestBody Job job)
    {
        return jobService.saveJob(job);
    }

    @GetMapping("/api/job")
    public List<Job> getjobs()
    {
        return jobService.showJob();
    }

    @GetMapping("/api/job/{jobId}")
    public Optional<Job> getjobbies(@PathVariable int jobId)
    {
        return jobService.showJobEach(jobId);
    }
}
