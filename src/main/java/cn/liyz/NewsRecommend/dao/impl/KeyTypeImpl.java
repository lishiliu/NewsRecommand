package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.KeyTypeDao;
import cn.liyz.NewsRecommend.entity.KeyType;
import cn.liyz.NewsRecommend.entity.User;
import cn.liyz.NewsRecommend.mapper.KeyTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/10.
 */
@Repository
public class KeyTypeImpl implements KeyTypeDao {
    @Autowired
    KeyTypeMapper keyTypeMapper;

    public int insert(KeyType keyType) {
        return keyTypeMapper.insert(keyType);
    }

    public int deleteById(int id) {
        return keyTypeMapper.deleteById(id);
    }

    public int update(KeyType keyType) {
        return keyTypeMapper.update(keyType);
    }

    public KeyType selectById(int id) {
        return keyTypeMapper.selectById(id);
    }

    public KeyType selectByKeyType(String keyType) {
        return keyTypeMapper.selectByKeyType(keyType);
    }

    public List<KeyType> selectAllKeyType() {
        return keyTypeMapper.selectAllKeyType();
    }


}
