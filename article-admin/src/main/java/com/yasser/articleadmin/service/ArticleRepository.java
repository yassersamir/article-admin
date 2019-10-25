package com.yasser.articleadmin.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yasser.articleadmin.entity.Articles;

public interface ArticleRepository extends JpaRepository<Articles, Long>{

}
