package com.funnlearn.coursesapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topic =Arrays.asList(
			new Topic("java","java","Java Topic"),
			new Topic("spring","spring","spring descpription"),
			new Topic("javascript","javascript","javascript descrption")
			
			);
	
	public List<Topic> getAllTopics()
	{
		return topic;
	}

}
