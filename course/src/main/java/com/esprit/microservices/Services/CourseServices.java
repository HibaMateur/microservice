package com.esprit.microservices.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.esprit.microservices.Repo.CourseRepo;
import com.esprit.microservices.entity.Course;

@Service

public class CourseServices {

	@Autowired
	private CourseRepo courserepo;

	public Course saveCourse(@RequestBody Course course) {
		return courserepo.save(course);
	}

	public Course getbyidnow(Long idcourse) {
		System.out.println("saved");
		return courserepo.findById(idcourse).orElse(null);
	}

}
