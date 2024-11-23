package com.sukla.service;

import java.util.List;

import com.sukla.bindings.Course;

public interface CourseService
{
	public String upsert(Course course);
	public Course getById(Integer id);
	public List<Course> getAllCourses();
	public String deleteByID(Integer cid);
}
