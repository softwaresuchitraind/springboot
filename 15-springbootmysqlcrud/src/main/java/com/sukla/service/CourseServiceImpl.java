package com.sukla.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukla.bindings.Course;
import com.sukla.exception.NoCourseFoundException;
import com.sukla.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService
{
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public String upsert(Course course)
	{
		courseRepository.save(course);// Upset
		return "success";
	}

	@Override
	public Course getById(Integer id)
	{
		Optional<Course> byId = courseRepository.findById(id);
		if (byId.isPresent())
		{
			return byId.get();
		} else
		{
			throw new NoCourseFoundException("Course Not found");
		}
	}

	@Override
	public List<Course> getAllCourses()
	{
		List<Course> all = courseRepository.findAll();
		return all;
	}

	@Override
	public String deleteByID(Integer cid)
	{
		if (courseRepository.existsById(cid))
		{
			courseRepository.deleteById(cid);
			return "Deleted Successfully";
		} else
		{
			return "record not found";
		}
	}

}
