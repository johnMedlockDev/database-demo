package com.johnmedlock.database.databasedemo.jpa;

import com.johnmedlock.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//Repository
//Transaction
@Transactional
@Repository
public class PersonJpaRepository {

    //connect to database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id); //jpa
    }
}
