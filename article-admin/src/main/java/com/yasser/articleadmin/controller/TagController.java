package com.yasser.articleadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.articleadmin.entity.Tags;
import com.yasser.articleadmin.service.TagService;

@RestController
@CrossOrigin
public class TagController {
	@Autowired
	private TagService tagService;
	
	@RequestMapping("/allTags")
	public List<Tags> getAllTags() {
		return tagService.getAllTags();
	}
	
	@RequestMapping(value = "/addTag", method = RequestMethod.POST)
	public void addArticles(@RequestBody Tags tags) {
		tagService.addTags(tags);
	}

}
