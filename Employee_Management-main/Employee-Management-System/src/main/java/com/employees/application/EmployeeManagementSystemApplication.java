package com.employees.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employees.application.service.EmployeeService;

@SpringBootApplication

public class EmployeeManagementSystemApplication implements CommandLineRunner {

	@Autowired
	EmployeeService employeeServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}
