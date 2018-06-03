package com.matveyenka.dao.common;

import com.matveyenka.entity.BaseEntity;

import java.util.List;

public interface BaseDao<T extends BaseEntity> {

    T findOne(Long id);

    Long save(T entity);

    List<T> findAll();
}
