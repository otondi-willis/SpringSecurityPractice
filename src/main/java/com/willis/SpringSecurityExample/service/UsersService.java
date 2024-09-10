package com.willis.SpringSecurityExample.service;

import com.willis.SpringSecurityExample.model.Users;
import com.willis.SpringSecurityExample.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsersService {
    @Autowired
    private UserRepo repo;
    public Users register(Users user){
        return repo.save(user);
    }
}
