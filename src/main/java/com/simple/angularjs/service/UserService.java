package com.simple.angularjs.service;

import com.simple.angularjs.model.User;

public class UserService {

    public User getDefaultUser()
    {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }
}
