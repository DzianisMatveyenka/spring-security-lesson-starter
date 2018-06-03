package com.matveyenka.dao;

import com.matveyenka.dao.common.BaseDao;
import com.matveyenka.entity.User;

/**
 * @author i.sukach
 */
public interface UserDao extends BaseDao<User> {

    User findByName(String name);
}
