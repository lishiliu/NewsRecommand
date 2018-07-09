package cn.liyz.NewsRecommand.dao;

import cn.liyz.NewsRecommand.base.BaseTest;
import cn.liyz.NewsRecommand.entity.User;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liyan on 2018/7/9.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void selectUserId() {
        User user  = userDao.selectUserById(1);
        Assert.assertTrue(user != null);
    }
}
