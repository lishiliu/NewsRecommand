package cn.liyz.NewsRecommend.service;

import cn.liyz.NewsRecommend.base.BaseTest;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void sendKeyTypeTest() {
        List<String> keyTypeList=new ArrayList<String>();
        keyTypeList.add("科技");
        keyTypeList.add("军事");
        keyTypeList.add("教育");
        int result = userService.addKeyType(keyTypeList,"hhh");
        System.out.println(result);
    }

    @Test
    public void getAllLabelTest() {
        List<String> keyTypeList=userService.getAllLabel("hhh");
        Assert.assertTrue(keyTypeList != null);
    }

}
