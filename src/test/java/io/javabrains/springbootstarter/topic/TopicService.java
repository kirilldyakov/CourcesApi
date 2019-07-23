package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "12", "3"),
			new Topic("java", "22", "3"),
			new Topic("vb", "32", "3"),
			new Topic("kotlin", "42", "3")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
