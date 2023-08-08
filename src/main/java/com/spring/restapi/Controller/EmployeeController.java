package com.spring.restapi.Controller;

import com.spring.restapi.Entity.Employee;
import com.spring.restapi.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeID}")
    public Employee findByEmployee(@PathVariable Employee employeeID) {
        return employeeID;
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employeeID) {
        employeeID.setId(0);
        Employee dbEmployee = employeeService.save(employeeID);
        return dbEmployee;
    }

    @PutMapping("/employee")
    public Employee modifyEmployee(@RequestBody Employee employeeID) {
        Employee dbEmployee = employeeService.save(employeeID);
        return dbEmployee;
    }

    @DeleteMapping("/employee/{employeeID}")
    public Employee deleteEmployee(@PathVariable int employeeID) {
        Employee dbEmployee = employeeService.findByID(employeeID);
        return dbEmployee;
    }
}
