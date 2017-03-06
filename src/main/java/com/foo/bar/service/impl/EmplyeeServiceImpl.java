package com.foo.bar.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foo.bar.entity.Employee;
import com.foo.bar.repository.EmployeeRepository;
import com.foo.bar.service.EmployeeService;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		Iterable<Employee> iterable = employeeRepository.findAll();
		List<Employee> employees = new ArrayList<>();
		iterable.forEach(employees::add);
		return employees;
	}

}
