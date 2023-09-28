package com.tarun1805.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJPARepository repository;

    @Autowired
    private CourseSpringDataJPDAReposityory repository;

    @Override
    public void run(String... args) throws Exception{
        repository.save(new Course(1,"leanr 1","tarun"));
        repository.save(new Course(2,"leanr 2","tarun"));
        repository.save(new Course(3,"leanr 3","tarun"));
//        repository.deleteById(1l);
//        System.out.println(repository.findById(2l));
//        repository.findAll();
        System.out.println(repository.findAll());
    }
}
