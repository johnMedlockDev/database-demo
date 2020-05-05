package com.johnmedlock.database.databasedemo;

import com.johnmedlock.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJPADemoApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJPADemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("User id 10001 -> {}", repository.findById(10001));
//        logger.info("All users-> {}", dao.findAll());
//        logger.info("Deleting  10002 -> No of Rows Deleted - {}", dao.deleteById(10002));
//        logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "tara", "berlin", new Date())));
//        logger.info("Update 10003 -> {}", dao.update(new Person(10003, "Pieter", "Utrecht", new Date())));
    }
}
