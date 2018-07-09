package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.base.BaseTest;
import cn.liyz.NewsRecommend.entity.User;
import cn.liyz.NewsRecommend.mapper.UserMapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liyan on 2018/7/9.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUserId() {
        User user  = userMapper.selectUserById(1);
        Assert.assertTrue(user != null);
    }
}
