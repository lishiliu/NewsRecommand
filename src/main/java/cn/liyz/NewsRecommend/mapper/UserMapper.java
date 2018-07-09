package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by liyan on 2018/7/9.
 */
@Component
public interface UserMapper {
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
    User update(User user);

    /**
     * 根据id查询用户信息
     */
    User selectUserById(long id);

    /**
     * 根据用户名查询用户信息
     */
    User selectByUsername(String username);
}
