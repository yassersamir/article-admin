package com.yasser.articleadmin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yasser.articleadmin.entity.Tags;

@Service
public class TagService {
	@Autowired
	private TagRepository tagRepository ;
	
	public void addTags(Tags tag) {
		tagRepository.save(tag);
	}
	
	public List<Tags> getAllTags(){
		List<Tags> tags = new ArrayList<>();
		tagRepository.findAll().forEach(tags::add);
		return tags;
	}

}
