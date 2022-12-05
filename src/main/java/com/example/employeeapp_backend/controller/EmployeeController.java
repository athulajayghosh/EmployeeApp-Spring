package com.example.employeeapp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String Homepage(){
        return "Homepage";
    }

    @GetMapping("/addemp")
    public String addemp(){
        return "Add Employee Page";
    }

    @GetMapping("/searchemp")
    public String searchemp(){
        return "Search Employee page";
    }
    @GetMapping("/editemp")
    public String editemp(){
        return "Edit employee page";
    }
    @GetMapping("/viewallemp")
    public String viewallemp(){
        return "View all employee page";
    }
    @GetMapping("/deleteemp")
    public String deleteemp(){
        return "delete employee page";
    }

}
