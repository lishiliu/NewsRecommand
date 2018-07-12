package cn.liyz.NewsRecommend.service.impl;

import cn.liyz.NewsRecommend.dao.KeyTypeDao;
import cn.liyz.NewsRecommend.dao.UserKeyTypeDao;
import cn.liyz.NewsRecommend.entity.KeyType;
import cn.liyz.NewsRecommend.service.KeyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Service
public class KeyTypeServiceImpl implements KeyTypeService{
    @Autowired KeyTypeDao keyTypeDao;

    @Autowired UserKeyTypeDao userKeyTypeDao;

    public List<KeyType> getAllKeyType() {
        return keyTypeDao.selectAllKeyType();
    }

    public int deleteUserKeyType(int userId,String keyType) {
        KeyType keyType1=keyTypeDao.selectByKeyType(keyType);
        int keyTypeId=keyTypeDao.deleteById(keyType1.getId());
        int result=userKeyTypeDao.delete(userId,keyTypeId);
        return result;
    }
}
