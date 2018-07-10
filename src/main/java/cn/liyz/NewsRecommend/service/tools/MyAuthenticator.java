package cn.liyz.NewsRecommend.service.tools;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by liyan on 2018/7/9.
 * 密码验证器
 */
public class MyAuthenticator extends Authenticator {
    String username=null;
    String password=null;

    public MyAuthenticator(){

    }

    public MyAuthenticator(String username,String password){
        this.username = username;
        this.password = password;
    }

    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(username, password);
    }

}
