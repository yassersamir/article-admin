package com.yasser.articleadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.articleadmin.entity.Articles;
import com.yasser.articleadmin.entity.Tag;
import com.yasser.articleadmin.service.ArticleService;

@RestController
@CrossOrigin
public class ArticlesController {
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/allArticles")
	public List<Articles> getAllArticles() {
		return articleService.getAllArticles();
	}
	
	@RequestMapping(value = "/addArticle", method = RequestMethod.POST)
	public void addArticles(@RequestBody Articles article) {
		articleService.setArticle(article);
	}
	
	@RequestMapping(value = "/addArticleTags", method = RequestMethod.POST)
	public void addArticles(@RequestBody Tag[] tags) {
		articleService.addArticle(tags);
	}

}
