package com.demo.user.model;

import com.demo.user.model.User;

public interface UserServiceEx {
    void addUser(String name, int age);
    
    User getUser(String id);
}
