package com.crud.Repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

	public List<Course> findByCoursenameIn(Collection<String> name);
}
