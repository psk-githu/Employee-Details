package com.EmployeeDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeDetails.domain.EmployeeDetail;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetail,Integer> {

}
