package com.tarun1805.springboot.learnspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tarun1805.springboot.learnspringboot.Course;

public interface CourseSpringDataJPDAReposityory  extends JpaRepository<Course,Long> {
}
