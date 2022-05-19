package com.murat.hrms.api.controllers;


import com.murat.hrms.business.abstracts.JobAdvertisementService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api/controllers/jobadvertisement")
public class JobAdvertisementController{
    private JobAdvertisementService jobAdvertisementService;
    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }


    @GetMapping("/findall")
    DataResult<List<JobAdvertisement>> findAll(){
        return this.jobAdvertisementService.findAll();
    }
}
