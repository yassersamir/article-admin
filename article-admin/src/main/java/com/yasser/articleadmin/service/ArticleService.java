package com.yasser.articleadmin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasser.articleadmin.entity.Articles;
import com.yasser.articleadmin.entity.Tag;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private TagRepository tagRepository;

	private Articles articles;

	public Articles getArticle() {
		return articles;
	}

	public void setArticle(Articles article) {
		this.articles = article;
	}

	public void addArticle(Articles article) {
		articleRepository.save(article);
	}

	public List<Articles> getAllArticles() {
		List<Articles> articles = new ArrayList<>();
		articleRepository.findAll().forEach(articles::add);
		return articles;
	}

	public void addArticle(Tag[] tag) {
		for (Tag ta : tag) {
			getArticle().getTags().add(tagRepository.findById(ta.getId()).orElse(null));
			tagRepository.findById(ta.getId()).orElse(null).getArticle().add(getArticle());
		}
		addArticle(getArticle());
	}
}
