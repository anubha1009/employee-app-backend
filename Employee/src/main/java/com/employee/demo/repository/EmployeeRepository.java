package com.employee.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.demo.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee , Integer> {

}
