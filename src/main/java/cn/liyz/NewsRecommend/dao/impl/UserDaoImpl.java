package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.UserDao;
import cn.liyz.NewsRecommend.entity.User;
import cn.liyz.NewsRecommend.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by liyan on 2018/7/9.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public int deleteByUsername(String username) {
        return userMapper.deleteByUsername(username);
    }

    public int deleteById(int id) {
        return userMapper.deleteById(id);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public User selectUserById(long id) {
        return userMapper.selectUserById(id);
    }

    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    public User selectUserByUsernameAndPassword(String username, String password) {
        return userMapper.selectUserByUsernameAndPassword(username,password);
    }

    public int selectCountByUserName(String username) {
        return userMapper.selectCountByUserName(username);
    }

    public int selectCountByEmail(String email) {
        return userMapper.selectCountByEmail(email);
    }


}
