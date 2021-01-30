package spring.boot.payroll.aop;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import spring.boot.payroll.exception.EmployeeNotFoundException;

@ControllerAdvice
public class EmployeeControllerAdvice {

	@ResponseBody
	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(EmployeeNotFoundException employeeNotFoundException) {
		return employeeNotFoundException.getMessage();
	}

}
