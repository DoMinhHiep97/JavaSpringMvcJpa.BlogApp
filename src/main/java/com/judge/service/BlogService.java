package com.judge.service;

import com.judge.model.Blog;

public interface BlogService extends GeneralService<Blog>{

    Blog findByIdHaveBusiness(Long id);

    void saveHaveBusiness(Blog blog);

    void removeHaveBusiness(Long id);
}
