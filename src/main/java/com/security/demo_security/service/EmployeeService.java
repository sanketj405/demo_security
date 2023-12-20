package com.security.demo_security.service;

import com.security.demo_security.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<Employee>();

    public EmployeeService(){
        empList.add(new Employee(UUID.randomUUID().toString(), "Matt","matt@email.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "Mark","mark@email.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "Mathew","mathew@email.com"));
    }

    public List<Employee> getEmployeeList(){
        return empList;
    }
}
