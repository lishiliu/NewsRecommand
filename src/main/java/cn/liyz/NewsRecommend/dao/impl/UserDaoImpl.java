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
        return 0;
    }

    public int deleteByUsername(String username) {
        return 0;
    }

    public int deleteById(int id) {
        return 0;
    }

    public User update(User user) {
        return null;
    }

    public User selectUserById(long id) {
        return userMapper.selectUserById(id);
    }

    public User selectByUsername(String username) {
        return null;
    }
}
