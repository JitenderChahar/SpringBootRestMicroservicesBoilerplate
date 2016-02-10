package com.dzee.gslab.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dzee.gslab.exception.GenericException;
import com.dzee.gslab.model.Employee;

@RestController
@RequestMapping("/webapi")
public class EmployeeController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() throws GenericException {
		String exceptionOccured = "EXCEPTION_NOT_OCCURED";
		if (exceptionOccured.equalsIgnoreCase("EXCEPTION")) {
			throw new GenericException("unknown");
		}

		Employee employee = new Employee();
		employee.setFirstName("Jitender");
		employee.setLastName("Singh");
		employee.setEmail("abc@gmail.com");
		employee.setEmployeeId("123");
		employee.setDepartment("Management");
		employee.setDateOfJoining("10 june 2015");
		return employee;

	}
}
