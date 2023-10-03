package dev.vpetrov.paging.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import dev.vpetrov.paging.model.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>, CrudRepository<Person, Integer> {

}
