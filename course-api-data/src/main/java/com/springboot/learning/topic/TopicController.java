package com.springboot.learning.topic;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	//GET Request to view all topics
	@RequestMapping("/topics")
	public List<Topic> getTopic() {
		return topicService.getAllTopics();
	}
	// GET Request /topics/{topicId}
	@RequestMapping("/topics/{topicId}")
	public Optional<Topic> getTopic(@PathVariable String topicId) {
		return topicService.getTopic(topicId);
	}
	// POST Request to Create new Topic
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	// PUT Request to Update Topic
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String topicId) {
		topicService.updateTopic(topicId, topic);
	}
	// DELETE Request to Delete Topic 
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}")
	public void deleteTopic(@PathVariable String topicId) {
		topicService.deleteTopic(topicId);
	}
	
	
	
}
