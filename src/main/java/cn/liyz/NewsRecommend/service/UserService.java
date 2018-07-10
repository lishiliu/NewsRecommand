package cn.liyz.NewsRecommend.service;

import cn.liyz.NewsRecommend.entity.User;

import java.util.List;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
public interface UserService {

    int login(String username, String password);

    int addUser(User user);

    int addCustomLabel(String username,String customLabel);

    int addKeyType(List<String> keyTypeList,String username);

    int updatePassword(String username, String oldPassword, String newPassword);

    int updateUser(User user);

    String sendRandomNumCode(String email);

}
