package com.resource.persistence.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.resource.persistence.model.Foo;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
