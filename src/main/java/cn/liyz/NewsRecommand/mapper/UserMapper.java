package cn.liyz.NewsRecommand.mapper;

import cn.liyz.NewsRecommand.entity.User;

/**
 * Created by liyan on 2018/7/9.
 */
public interface UserMapper {
    User selectUserById(long id);
}
