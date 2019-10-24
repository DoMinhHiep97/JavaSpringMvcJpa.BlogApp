package com.judge.service;

import com.judge.model.Blog;
import com.judge.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog findByIdHaveBusiness(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void saveHaveBusiness(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void removeHaveBusiness(Long id) {
        blogRepository.remove(id);
    }

    @Override
    public List findAllHaveBusiness() {
        return blogRepository.findAll();
    }

    @Override
    public void addHaveBusiness(Blog blog) {

    }
}
