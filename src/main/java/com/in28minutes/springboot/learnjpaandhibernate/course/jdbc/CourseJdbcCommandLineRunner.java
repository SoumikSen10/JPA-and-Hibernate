package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//  @Autowired
//  private CourseJdbcRepository repository;	
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repository.insert(new Course(1,"Learn AWS now!","in28minutes"));
		//repository.insert(new Course(2,"Learn Azure now!","in28minutes"));
		//repository.insert(new Course(3,"Learn DevOps now!","in28minutes"));
		
		repository.save(new Course(1,"Learn AWS now!","in28minutes"));
		repository.save(new Course(2,"Learn Azure now!","in28minutes"));
		repository.save(new Course(3,"Learn DevOps now!","in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("Learn AWS Jpa!"));
		System.out.println(repository.findByName("Learn DevOps Jpa!"));
		
	}
	
}
