package com.springboot.learning.course;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.topic.Topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	//GET Request to view all topics
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}
	// GET Request /topics/{topicId}
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	// POST Request to Create new Topic
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	// PUT Request to Update Topic
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	// DELETE Request to Delete Topic 
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{courseId}")
	public void deleteTopic(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
	
	
	
}
