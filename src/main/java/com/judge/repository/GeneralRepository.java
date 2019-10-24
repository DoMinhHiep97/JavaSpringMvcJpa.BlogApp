package com.judge.repository;

import java.util.List;

public interface GeneralRepository<E> {

    List<E> findAll();

    void add(E e);

    E findById(Long id);

    void save(E model);

    void remove(Long id);
}
