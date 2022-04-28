package com.demo.user.service;

import com.demo.user.model.User;
import com.demo.user.model.UserServiceEx;
import org.apache.dubbo.config.annotation.Service;
//import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zlb
 * @since 4/21/22 6:43 PM
 */
//@DubboService
@Service
public class UserServiceExImpl implements UserServiceEx {
    @Override
    public void addUser(String name, int age) {
        System.out.println("add User " + name + " " + age);
    }
    
    @Override
    public User getUser(Long id) {
        User u = new User();
        u.setAge(1);
        u.setName("abc");
        return u;
    }
}
