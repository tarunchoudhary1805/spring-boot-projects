package com.tarun1805.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn aws","in28minutes"),
                new Course(2,"Learn docker","in28minutes"),
                new Course(3,"Learn spring","in28minutes")
        );
    }


}
