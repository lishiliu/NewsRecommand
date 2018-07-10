package cn.liyz.NewsRecommend.service;

import cn.liyz.NewsRecommend.base.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by liyan on 2018/7/10.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest extends BaseTest{
    @Autowired
    private UserService userService;

    @Test
    public void sendRandomNumCodeTest() {
        String result = userService.sendRandomNumCode("liyanzhaohyh@163.com");
        System.out.println(result);
    }



}
