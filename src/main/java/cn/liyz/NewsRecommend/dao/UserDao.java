package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.User;

/**
 * Created by liyanzhao on 2018/07/09.
 */
public interface UserDao {
    /**
     * 添加用户
     */
    int insert(User user);

    /**
     * 根据用户名删除用户
     */
    int deleteByUsername(String username);

    /**
     * 根据id删除用户
     */
    int deleteById(int id);

    /**
     * 修改用户信息
     */
    int update(User user);

    /**
     * 根据id查询用户信息
     */
    User selectUserById(long id);

    /**
     * 根据用户名查询用户信息
     */
    User selectByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息
     */
    User selectUserByUsernameAndPassword(String username,String password);

    int selectCountByUserName(String username);

    int selectCountByEmail(String email);
}
