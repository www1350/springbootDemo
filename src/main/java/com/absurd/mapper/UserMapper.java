package com.absurd.mapper;

import com.absurd.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2016/5/20.
 */
public interface UserMapper {
   public User selectById(@Param("id") long id);
    public User selectByName(@Param("username") String username);
    public  List<User> selectAll();
    public  int selectCount();
    public int insert(User u);
    public int delete(Long id);
 public boolean update(User u);
}
