package com.funnlearn.coursesapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topic")
	public List<Topic> getTopics()
	{
		return Arrays.asList(
				new Topic("java","java","Java Topic"),
				new Topic("spring","spring","spring descpription"),
				new Topic("javascript","javascript","javascript descrption")
				
				);
				
				
		
	
	}
	
}
