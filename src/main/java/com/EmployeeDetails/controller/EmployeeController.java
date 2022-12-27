package com.EmployeeDetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeDetails.domain.EmployeeDetail;
import com.EmployeeDetails.exception.CustomException;
import com.EmployeeDetails.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/list")
	public List<EmployeeDetail> allEmployee(){
		return service.listAllEmployee();
	}
	@GetMapping("/employee/{id}")
	public Optional<EmployeeDetail> employeeById(@PathVariable int id){
		return service.getEmployeeById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) throws CustomException {
		service.removeEmployeeById(id);
		return "Deleted Successfully";
	}
	
	@PostMapping("/add")
	public String saveEmployee(EmployeeDetail employee) {
		service.addEmployee(employee);
		return "Added Successfully";
	}	
	
}
