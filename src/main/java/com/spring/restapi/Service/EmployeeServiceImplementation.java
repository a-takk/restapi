package com.spring.restapi.Service;

import com.spring.restapi.Entity.Employee;
import com.spring.restapi.Entity.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findByID(int theID) {
        Optional<Employee> findID = employeeRepository.findById(theID);
        Employee employee = null;
        if (findID.isPresent()) {
            employee = findID.get();
        } else {
            throw new RuntimeException("Didn't find user ID: " + theID);
        }
        return employee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteByID(int theID) {
        employeeRepository.deleteById(theID);
    }
}
