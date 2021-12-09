package com.springboot.learning.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboot.learning.topic.Topic;

//import com.springboot.learning.topic.Topic;


//Data Model of the Topic Entity- Using Annotation @Entity, @Id for PK.
@Entity
public class Course {
	@Id
	private String courseId;
	private String courseName;
	private String courseDesc;
	
	@ManyToOne
	private Topic topic;
	
	
	
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Course() {

	}
	public Course(String courseId, String courseName, String courseDesc,String topicId) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.topic=new Topic(topicId,"","");
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	
	
	

}
