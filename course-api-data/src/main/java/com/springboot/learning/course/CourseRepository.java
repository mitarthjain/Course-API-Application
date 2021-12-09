package com.springboot.learning.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);
	//public List<Course> findByName(String courseName);
	//public List<Course> findByDescription(String courseDesc);
	
		
	
	
	
	

}
