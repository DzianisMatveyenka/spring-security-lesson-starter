package com.matveyenka.dao;

import com.matveyenka.dao.common.BaseDaoImpl;
import com.matveyenka.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

    @Override
    public User findByName(String name) {
        return getCurrentSession()
                .createQuery("select u from User u where u.name = :name", User.class)
                .setParameter("name", name)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
    }
}
