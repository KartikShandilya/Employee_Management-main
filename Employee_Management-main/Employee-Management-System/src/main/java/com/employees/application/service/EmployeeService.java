package com.employees.application.service;

import java.util.List;

import com.employees.application.model.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();

	Employee findEmployeeById(int id);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(int id);

}