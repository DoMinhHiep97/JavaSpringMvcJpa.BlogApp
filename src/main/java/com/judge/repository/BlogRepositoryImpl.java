package com.judge.repository;

import com.judge.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query=em.createQuery("select b from Blog b",Blog.class);
        return query.getResultList();
    }

    @Override
    public void add(Blog blog) {

    }

    @Override
    public Blog findById(Long id) {
        TypedQuery<Blog> query=em.createQuery("select b from Blog b where b.id=:id",Blog.class);
        query.setParameter("id",id);

        try{
            return query.getSingleResult();
        }catch(NoResultException e){
            return  null;
        }
    }

    @Override
    public void save(Blog model) {
        if(model.getId() !=null){
            em.merge(model);
        }else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Blog blog=findById(id);
        if(blog !=null){
            em.remove(blog);
        }
    }
}
