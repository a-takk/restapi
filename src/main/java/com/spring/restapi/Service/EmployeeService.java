package com.spring.restapi.Service;

import com.spring.restapi.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findByID(int theID);
    public Employee save(Employee theEmployee);
    public void deleteByID(int theID);
}
