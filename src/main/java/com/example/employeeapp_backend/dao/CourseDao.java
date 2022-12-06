package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Employee,Integer> {

}
