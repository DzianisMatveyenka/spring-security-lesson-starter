package com.matveyenka.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        //TODO: implement
        return null;
    }
}
