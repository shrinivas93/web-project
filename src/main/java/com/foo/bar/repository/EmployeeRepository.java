package com.foo.bar.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.foo.bar.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
