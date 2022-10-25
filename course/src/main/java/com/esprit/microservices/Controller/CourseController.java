package com.esprit.microservices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservices.Services.CourseServices;
import com.esprit.microservices.entity.Course;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseServices courseservices;
	
	
	@PostMapping("/add")

	public Course saveCourse(@RequestBody Course course)
	{
		
		return courseservices.saveCourse(course);
	}
	@GetMapping("/{id}")
	public Course findCourse(@PathVariable("id") Long idcourse)
	{
		return courseservices.getbyidnow(idcourse);
	}
}
