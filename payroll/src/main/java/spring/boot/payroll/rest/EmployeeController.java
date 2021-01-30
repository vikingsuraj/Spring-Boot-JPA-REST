package spring.boot.payroll.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.payroll.entity.Employee;
import spring.boot.payroll.service.EmployeeRepository;

@RestController
public class EmployeeController {

	private final EmployeeRepository employeeRepository;

	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@GetMapping("/employees")
	List<Employee> all() {
		return employeeRepository.findAll();
	}
}
