package cn.liyz.NewsRecommand.dao;

import cn.liyz.NewsRecommand.entity.User;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
public interface UserDao {
    User selectUserById(long id);
}
