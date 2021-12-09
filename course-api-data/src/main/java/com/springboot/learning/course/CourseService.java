package com.springboot.learning.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
//	//private List<Course> topics=new ArrayList<>(Arrays.asList(
//			new Course("CS101","DSA","Data Structures and Algorithms"),
//			new Course("CS102","Java","Java Programming & OOPS"),
//			new Course("CS103","DBMS","Database Management Systems")				
//			));
	
	public List<Course> getAllCourses(String topicId){
		//return topics;
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}
	
	public Optional<Course> getCourse(String courseId) {
		//return topics.stream().filter(t -> t.getTopicId().equals(topicId)).findFirst().get();
		return courseRepository.findById(courseId);
	}
	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

//	public void updateCourse(Course course) {
//		courseRepository.save(course);
////		for(int i=0;i<topics.size();i++) {
////			Topic t=topics.get(i);
////			if(t.getTopicId().equals(topicId)) {
////				topics.set(i, topic);
////				return;
////			}
////		}
		
		
		
	

	public void deleteCourse(String courseId) {
		courseRepository.deleteById(courseId);
		//topics.removeIf(t -> t.getTopicId().equals(topicId));
		
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
		
	}

	


}
