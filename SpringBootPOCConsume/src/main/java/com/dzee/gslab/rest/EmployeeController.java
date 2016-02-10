package com.dzee.gslab.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dzee.gslab.model.Employee;

@RestController
@RequestMapping("/webapi")
public class EmployeeController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumeEmployee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee() {
		Employee employee = restTemplate.getForObject(
				"http://localhost:8081/webapi/employee", Employee.class);
		employee.setEmail("xyz@gmail.com");
		return employee;
	}
}
