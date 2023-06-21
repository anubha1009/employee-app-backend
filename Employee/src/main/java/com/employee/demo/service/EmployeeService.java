package com.employee.demo.service;

import java.util.List;

import com.employee.demo.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee saveEmployee(Employee employee);
}
