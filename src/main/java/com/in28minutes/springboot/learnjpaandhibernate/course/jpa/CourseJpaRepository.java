package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository 
{
	@PersistenceContext //could also use autowired
	private EntityManager entityManager;

	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	
	public Course findById(long id)
	{
		return entityManager.find(Course.class,id);
	}
}
