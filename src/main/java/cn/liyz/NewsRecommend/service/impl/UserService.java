package cn.liyz.NewsRecommend.service.impl;

import cn.liyz.NewsRecommend.dao.KeyTypeDao;
import cn.liyz.NewsRecommend.dao.UserDao;
import cn.liyz.NewsRecommend.dao.UserKeyTypeDao;
import cn.liyz.NewsRecommend.entity.KeyType;
import cn.liyz.NewsRecommend.entity.MailSenderInfo;
import cn.liyz.NewsRecommend.entity.User;
import cn.liyz.NewsRecommend.entity.UserKeyType;
import cn.liyz.NewsRecommend.service.tools.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
@Service
public class UserService implements cn.liyz.NewsRecommend.service.UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private KeyTypeDao keyTypeDao;

    @Autowired
    private UserKeyTypeDao userKeyTypeDao;

    public Date getNowDateTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    public int login(String username, String password) {
        int result = 0;
        User user = userDao.selectUserByUsernameAndPassword(username, password);
        if (user != null) {
            result = 0;
        }
        return result;
    }

    public int addUser(User user) {
        user.setCreatetime(getNowDateTime());
        user.setLastmodify(getNowDateTime());
        int result = 0;
        if (userDao.selectCountByUserName(user.getUsername()) != 0) {
            result = -1;
        }
        if (result == 0 && userDao.selectCountByEmail(user.getEmail()) != 0) {
            result = -2;
        }

        if (result == 0) {
            userDao.insert(user);
        }
        return result;
    }

    public int addCustomLabel(String username, String customLabel) {
        User user=userDao.selectByUsername(username);
        user.setCustomLabel(customLabel);
        int result=userDao.update(user);
        return result;
    }

    public int addKeyType(List<String> keyTypeList, String username) {
        User user=userDao.selectByUsername(username);
        int userId=(int)user.getId();
        UserKeyType userKeyType=new UserKeyType();
        userKeyType.setUserId(userId);
        int result=0;
        for(int i=0;i<keyTypeList.size();i++){
            KeyType keyType=keyTypeDao.selectByKeyType(keyTypeList.get(i));
             int keyTypeId=keyType.getId();
             userKeyType.setKeyTypeId(keyTypeId);
             result=userKeyTypeDao.insert(userKeyType);
        }
        return result ;
    }

    public int updatePassword(String username, String oldPassword, String newPassword) {
        User res = userDao.selectUserByUsernameAndPassword(username, oldPassword);
        if (res != null) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(newPassword);
            return userDao.update(user);
        } else {
            return -1;
        }
    }

    public int updateUser(User user) {
        int result = 0;
        User user1 = userDao.selectByUsername(user.getUsername());
        if (userDao.selectCountByEmail(user.getEmail()) != 0 && !user.getEmail().equals(user1.getEmail())) {
            result = -1;
        }
        if (result == 0) {
            result = userDao.update(user);
        }
        return result;
    }

    public String sendRandomNumCode(String email) {
        String codeNum = this.getRandomNumCode();
        //这个类主要是设置邮件
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUsername("newssystem12@163.com");
        mailInfo.setPassword("newssystem123@");//您的邮箱密码
        mailInfo.setFromAddress("newssystem12@163.com");
        mailInfo.setToAddress(email);
        mailInfo.setSubject("新闻动态验证码");
        mailInfo.setContent(codeNum);
        //这个类主要来发送邮件
        MailSender sms = new MailSender();
        sms.sendTextMail(mailInfo);//发送文体格式
        sms.sendHtmlMail(mailInfo);//发送html格式
        return codeNum;
    }

    public  String getRandomNumCode() {
        String codeNum = "";
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int next = random.nextInt(10000);//目的是产生足够随机的数，避免产生的数字重复率高的问题
//    			System.out.println(next);
            codeNum += numbers[next % 10];
        }
        return codeNum;
    }
}
