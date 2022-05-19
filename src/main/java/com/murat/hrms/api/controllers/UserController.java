package com.murat.hrms.api.controllers;


import com.murat.hrms.business.abstracts.UserService;
import com.murat.hrms.core.utilities.results.DataResult;
import com.murat.hrms.entities.concretes.Employee;
import com.murat.hrms.entities.concretes.Employer;
import com.murat.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/findAll")
    DataResult<List<User>> findAll(){
        return this.userService.findAll();
    }
    @PostMapping("/addcompany")
    DataResult<Employer> addCompany(@RequestBody Employer employer){
        return this.userService.addCompany(employer);
    }
    }

