package com.matveyenka.dao.common;

import com.matveyenka.entity.BaseEntity;

import java.util.List;

/**
 * @author i.sukach
 */
public interface BaseDao<T extends BaseEntity> {

    T findOne(Long id);

    void save(T entity);

    List<T> findAll();
}
