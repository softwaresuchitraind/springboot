package com.sukla.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sukla.bindings.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable>
{

}
