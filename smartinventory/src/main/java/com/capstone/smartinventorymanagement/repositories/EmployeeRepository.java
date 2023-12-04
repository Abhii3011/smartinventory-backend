package com.capstone.smartinventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.smartinventorymanagement.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
