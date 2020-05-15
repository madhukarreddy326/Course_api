package com.funnlearn.coursesapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService; 

	@RequestMapping("/topic")
	public List<Topic> getTopics()
	{
		return topicService.getAllTopics();
	}
				
				
		
	
	
	
}
