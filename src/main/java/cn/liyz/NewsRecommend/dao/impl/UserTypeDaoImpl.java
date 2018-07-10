package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.UserKeyTypeDao;
import cn.liyz.NewsRecommend.entity.UserKeyType;
import cn.liyz.NewsRecommend.mapper.UserKeyTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/10.
 */
@Repository
public class UserTypeDaoImpl implements UserKeyTypeDao {

    @Autowired
    UserKeyTypeMapper userKeyTypeMapper;

    public int insert(UserKeyType userKeyType) {
        return userKeyTypeMapper.insert(userKeyType);
    }

    public int delete(int userId, int keyTypeId) {
        return userKeyTypeMapper.delete(userId,keyTypeId);
    }

    public List<UserKeyType> selectByUserId(int userId) {
        return userKeyTypeMapper.selectByUserId(userId);
    }
}
