package com.sukla.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sukla.bindings.Course;
import com.sukla.service.CourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
@Validated
public class CourseRestController
{
	@Autowired
	private CourseService courseService;

	@PostMapping("/course")
	public ResponseEntity<String> createRecord(@RequestBody @Valid Course course)
	{
		String status = courseService.upsert(course);
		HttpStatus created = HttpStatus.CREATED;
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer id)
	{
		Course course = courseService.getById(id);
		return new ResponseEntity<>(course, HttpStatus.OK);
	}

	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourseDetails()
	{
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}

	@PutMapping("/courseupdate")
	public ResponseEntity<String> updateRecord(@RequestBody Course course)
	{
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id)
	{
		String status = courseService.deleteByID(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
