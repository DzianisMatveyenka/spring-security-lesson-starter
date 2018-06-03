package com.matveyenka.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author i.sukach
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        //TODO: implement
        return null;
    }
}
