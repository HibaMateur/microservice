package com.esprit.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.microservices.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {


}
