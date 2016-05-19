package com.absurd.service;

import com.absurd.dao.UserDao;
import com.absurd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/5/19.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public boolean login(String username,String password){
       User u= userDao.queryUser(username);
        if(u.getPassword().equals(password)) return true;
        else return false;
    }
}
