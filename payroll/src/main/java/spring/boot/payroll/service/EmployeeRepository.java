package spring.boot.payroll.service;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
