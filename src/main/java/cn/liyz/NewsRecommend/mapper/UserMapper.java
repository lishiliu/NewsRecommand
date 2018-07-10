package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.User;
import org.apache.ibatis.annotations.Param;
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
    User selectUserByUsernameAndPassword(@Param("username") String username,@Param("password") String password);

    int selectCountByUserName(@Param("username") String username);

    int selectCountByEmail(@Param("email") String email);
}
