package com.johnmedlock.database.databasedemo.springdata;

import com.johnmedlock.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
