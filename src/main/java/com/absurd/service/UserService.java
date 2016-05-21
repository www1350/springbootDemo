package com.absurd.service;

import com.absurd.dao.UserDao;
import com.absurd.mapper.UserMapper;
import com.absurd.model.User;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    public boolean login(String username,String password){
//       User u= userDao.queryUser(username);
        User u= userMapper.selectByName(username);
        if(u.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes()))) return true;
        else return false;
    }
public  boolean register(User u){

    u.setPassword( DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
    User existU = userMapper.selectByName(u.getUsername());
    if(existU!=null) return false;
    else
        userMapper.insert(u);
    return true;
}

    public List<User> getAll(){
       return userMapper.selectAll();
    }


    public User getUser(Long id){
       return userMapper.selectById(id);
    }

    public boolean deleteUser(Long id){
        userMapper.delete(id);
        return true;
    }

    public boolean updateUser(User u){
       User existUser = userMapper.selectByName(u.getUsername());
        u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
        if(existUser!=null) {
            existUser.setPassword( u.getPassword());
            userMapper.update(existUser);
        }else
        userMapper.insert(u);
        return true;
    }

}
