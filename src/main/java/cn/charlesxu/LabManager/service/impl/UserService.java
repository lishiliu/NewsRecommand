package cn.charlesxu.LabManager.service.impl;

import cn.charlesxu.LabManager.dao.UserDao;
import cn.charlesxu.LabManager.entity.User;
import cn.charlesxu.LabManager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaoyanger on 2017/12/15.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    public User selectUserById(long id) {
        return userDao.selectUserById(id);
    }
}
