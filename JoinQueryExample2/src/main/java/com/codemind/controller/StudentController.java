package com.codemind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.dto.EmployeeRequest;
import com.codemind.dto.EmployeeRequest2;
import com.codemind.dto.OrderRquest;
import com.codemind.model.Employee;
import com.codemind.model.Student;
import com.codemind.repository.EmployeeRepository;
import com.codemind.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/saveStudent")
	public Student saveStudent( @RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@GetMapping("/getInfo")
	public List< OrderRquest> getInfo(){
		return studentRepository.getInforamation();
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/employee")
	public List<EmployeeRequest> getInfom(){
		return employeeRepository.getNamesaAndCity();
	}
	
	@GetMapping("/info")
	public List<EmployeeRequest2> getInformation(){
		return employeeRepository.getInformation();
	}
}









