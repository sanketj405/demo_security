package com.security.demo_security.controller;

import com.security.demo_security.model.Employee;
import com.security.demo_security.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class HomeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
     public List<Employee> getListOfEmployees(){
        return employeeService.getEmployeeList();
     }


}
