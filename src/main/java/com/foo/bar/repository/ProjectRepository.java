package com.foo.bar.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.foo.bar.entity.Project;

public interface ProjectRepository extends PagingAndSortingRepository<Project, Integer> {

}
