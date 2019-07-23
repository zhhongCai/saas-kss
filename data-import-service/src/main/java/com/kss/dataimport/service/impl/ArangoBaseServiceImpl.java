package com.kss.dataimport.service.impl;

import com.arangodb.springframework.repository.ArangoRepository;
import com.kss.dataimport.service.ArangoBaseService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

/**
 * @Author: zhenghong.cai
 * @Date: Create in 2019-07-23 15:18
 * @Description:
 */
public abstract class ArangoBaseServiceImpl<T, ID> implements ArangoBaseService<T, ID> {

    public abstract ArangoRepository getArangoRepository();

    @Override
    public <S extends T> S save(S entity) {
        return (S) getArangoRepository().save(entity);
    }

    @Override
    public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
        return getArangoRepository().saveAll(entities);
    }

    @Override
    public Optional<T> findById(ID id) {
        return getArangoRepository().findById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return getArangoRepository().existsById(id);
    }

    @Override
    public Iterable<T> findAll() {
        return getArangoRepository().findAll();
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> ids) {
        return getArangoRepository().findAllById(ids);
    }

    @Override
    public long count() {
        return getArangoRepository().count();
    }

    @Override
    public void deleteById(ID id) {
        getArangoRepository().deleteById(id);
    }

    @Override
    public void delete(T entity) {
        getArangoRepository().delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        getArangoRepository().deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        getArangoRepository().deleteAll();
    }

    @Override
    public Iterable<T> findAll(Sort sort) {
        return getArangoRepository().findAll(sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return getArangoRepository().findAll(pageable);
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return getArangoRepository().findOne(example);
    }

    @Override
    public <S extends T> Iterable<S> findAll(Example<S> example) {
        return getArangoRepository().findAll(example);
    }

    @Override
    public <S extends T> Iterable<S> findAll(Example<S> example, Sort sort) {
        return getArangoRepository().findAll(example, sort);
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return getArangoRepository().findAll(example, pageable);
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return getArangoRepository().count(example);
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return getArangoRepository().existsById(example);
    }
}
