package com.foo.bar.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.foo.bar.entity.Technology;

public interface TechnologyRepository extends PagingAndSortingRepository<Technology, Integer> {

}
