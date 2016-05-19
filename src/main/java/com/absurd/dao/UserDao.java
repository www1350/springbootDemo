package com.absurd.dao;

import com.absurd.core.dao.BaseDao;
import com.absurd.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/5/19.
 */
@Repository
public class UserDao extends BaseDao{
    public User queryUser(String username){
       return  getJdbcTemplate().queryForObject("select uid as id,username,password from t_user where username=?", new RowMapper<User>() {
           @Override
           public User mapRow(ResultSet resultSet, int i) throws SQLException {
               User u = new User();
               u.setId(resultSet.getLong("id"));
               u.setUsername(resultSet.getString("username"));
               u.setPassword(resultSet.getString("password"));
               return u;
           }
       },username);
    }

}
