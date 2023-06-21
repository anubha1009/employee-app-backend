package com.employee.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;
import com.employee.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}
	
}
