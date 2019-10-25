package com.yasser.articleadmin.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yasser.articleadmin.entity.Tags;

public interface TagRepository extends JpaRepository<Tags, Long> {

}
