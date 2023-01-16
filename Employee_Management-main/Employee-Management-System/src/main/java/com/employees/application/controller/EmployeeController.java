package com.employees.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employees.application.model.Employee;
import com.employees.application.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/*
	 * @GetMapping("/") public String test() { Employee employee=new Employee();
	 * employee.setId(1); employee.setFirstName("Bibi Mariyam");
	 * employee.setLastName("Sardar"); employee.setEmail("bibi@com");
	 * employeeService.addEmployee(employee); return "index-"; }
	 */

	// display list of employees
	@GetMapping("/")
	public String findAll(Model model) {
		model.addAttribute("ListEmployees", employeeService.findAllEmployees());
		return "home-page";
	}

	@GetMapping("/add")
	public String addEmployee(Model model) {
		model.addAttribute("Employees", new Employee());
		return "add-employee";

	}

	@PostMapping("/addEmployee")
	public String createEmployee(Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/";
	}

	@GetMapping("/update/{id}")
	public String employeeUpdatePage(Model model, @PathVariable("id") int id) {
		model.addAttribute("employee", employeeService.findEmployeeById(id));
		return "update-employee";

	}

	@PostMapping("/updateEmployee")
	public String updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(value = "id") int id) {
		this.employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}

}
