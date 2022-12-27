package com.EmployeeDetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeDetails.domain.EmployeeDetail;
import com.EmployeeDetails.exception.CustomException;
import com.EmployeeDetails.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public List<EmployeeDetail> listAllEmployee(){
		return repo.findAll();
	}
	public Optional<EmployeeDetail> getEmployeeById(int id) {
	Optional<EmployeeDetail> employee = repo.findById(id);
	if(!employee.isPresent()) {
		throw new CustomException("Employee not found for id: "+id);
	}
	return employee;
	}
	
	public void removeEmployeeById(Integer id) {
		repo.deleteById(id);		
	}
	
	public void addEmployee(EmployeeDetail employee) {
		repo.save(employee);
	}
}
