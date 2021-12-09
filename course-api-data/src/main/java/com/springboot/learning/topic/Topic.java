package com.springboot.learning.topic;

import javax.persistence.Entity;
import javax.persistence.Id;


//Data Model of the Topic Entity- Using Annotation @Entity, @Id for PK.
@Entity
public class Topic {
	@Id
	private String topicId;
	private String topicName;
	private String topicDesc;
	
	public Topic() {

	}
	public Topic(String topicId, String topicName, String topicDesc) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDesc = topicDesc;
	}
	public String getTopicDesc() {
		return topicDesc;
	}
	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	

}
