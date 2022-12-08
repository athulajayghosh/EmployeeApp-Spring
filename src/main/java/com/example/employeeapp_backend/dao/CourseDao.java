package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Employee,Integer> {
    @Query(value ="SELECT `id`, `companyname`, `designation`, `empcode`, `empname`, `mobile`, `password`, `salary`, `username` FROM `employee` WHERE `empcode`= :empcode" , nativeQuery = true)
    List<Employee> searchEmp( Integer empcode);

}
