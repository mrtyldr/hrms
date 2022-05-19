package com.murat.hrms.api.controllers;


import com.murat.hrms.business.abstracts.JobAdvertisementService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addJobAdvertisement")
    DataResult<JobAdvertisement> addJobAdvertisement(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.addJobAdvertisement(jobAdvertisement);
    }

    @GetMapping("/findByCompId")
    public DataResult<List<JobAdvertisement>> findByCompId(@RequestParam int compId){
        return this.jobAdvertisementService.findByCompId(compId);
    }

    @GetMapping("/findbycompname")
    public DataResult<List<JobAdvertisement>> findByCompName(@RequestParam String compName){
        return this.jobAdvertisementService.findByCompName(compName);
    }

    @GetMapping("/findallsortedbydate")
    public DataResult<List<JobAdvertisement>> findAllSortedByDate(){
        return this.jobAdvertisementService.findAllSortedByDate();
    }
}
