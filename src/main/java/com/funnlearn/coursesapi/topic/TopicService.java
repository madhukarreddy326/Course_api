package com.funnlearn.coursesapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topic =new ArrayList<>(Arrays.asList(
			new Topic("java","java","Java Topic"),
			new Topic("spring","spring","spring descpription"),
			new Topic("javascript","javascript","javascript descrption")
			
			));
	
	public List<Topic> getAllTopics()
	{
		return topic;
	}
	public Topic getTopic(String id)
	{
		return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic)
	{
		this.topic.add(topic);
	}
	public void updateTopic(Topic top,String id)
	{
		for(int i=0;i<topic.size();i++)
		{
			Topic t = topic.get(i);
			if(t.getId().equals(id))
			{
				topic.set(i, top);
			}
		}
	}
	public void deleteTopic(String id)
	{
		topic.removeIf(t ->t.getId().equals(id));
	}

}
