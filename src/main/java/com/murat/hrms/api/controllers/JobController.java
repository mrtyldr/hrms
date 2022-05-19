package com.murat.hrms.api.controllers;


import com.murat.hrms.business.concretes.JobManager;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.core.utilities.results.SuccessDataResult;
import com.murat.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private JobManager jobManager;
    @Autowired
    public JobController(JobManager jobManager) {
        this.jobManager = jobManager;
    }
    @GetMapping("/findall")
    DataResult<List<Job>> findAll(){
        return this.jobManager.findall();
    }

    @PostMapping("/addjobposition")
    DataResult<Job> addJobPosition(@RequestBody Job job){
        return this.jobManager.addJobPosition(job);
    }
}
