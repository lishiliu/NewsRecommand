package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.UserReadCountDao;
import cn.liyz.NewsRecommend.entity.UserReadCount;
import cn.liyz.NewsRecommend.mapper.UserReadCountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Repository
public class UserReadCountDaoImpl implements UserReadCountDao {
    @Autowired
    UserReadCountMapper userReadCountMapper;
    public int insert(UserReadCount userReadCount) {
        return userReadCountMapper.insert(userReadCount) ;
    }

    public int update(UserReadCount userReadCount) {
        return userReadCountMapper.update(userReadCount);
    }

    public List<UserReadCount> selectByUserId(int userId) {
        return userReadCountMapper.selectByUserId(userId);
    }

    public List<UserReadCount> selectTopByUserId(int userId) {
        return userReadCountMapper.selectTopByUserId(userId);
    }
}
