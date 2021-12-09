package com.springboot.learning.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("CS101","DSA","Data Structures and Algorithms"),
			new Topic("CS102","Java","Java Programming & OOPS"),
			new Topic("CS103","DBMS","Database Management Systems")				
			));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public Optional<Topic> getTopic(String topicId) {
		//return topics.stream().filter(t -> t.getTopicId().equals(topicId)).findFirst().get();
		return topicRepository.findById(topicId);
	}
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String topicId, Topic topic) {
		topicRepository.save(topic);
//		for(int i=0;i<topics.size();i++) {
//			Topic t=topics.get(i);
//			if(t.getTopicId().equals(topicId)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		
		
	}

	public void deleteTopic(String topicId) {
		topicRepository.deleteById(topicId);
		//topics.removeIf(t -> t.getTopicId().equals(topicId));
		
	}


}
