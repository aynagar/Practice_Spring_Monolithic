package com.example.demo.service;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.model.Employee;
public interface EmployeeService {
    Employee getEmployeeById(Long id);
    Employee addEmployee(EmployeeDTO employeeDTO);
}