package com.example.employeeapp_backend.controller;


import com.example.employeeapp_backend.dao.CourseDao;
import com.example.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private CourseDao dao;
    @GetMapping("/")
    public String Homepage(){
        return "Homepage";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp",consumes = "application/json" ,produces = "application/json")
    public Employee addemp(@RequestBody Employee e){
        System.out.println(e.getEmpcode());
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobile().toString());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        return e;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewallemp")
    public List<Employee> viewallemp(){

        return (List<Employee>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchemp",consumes = "application/json",produces = "application/json")
    public List<Employee> searchemp(@RequestBody Employee e){
        return (List<Employee>)dao.searchEmp(e.getEmpcode());
    }







    @PostMapping("/editemp")
    public String editemp(){
        return "Edit employee page";
    }

    @PostMapping("/deleteemp")
    public String deleteemp(){
        return "delete employee page";
    }

}
