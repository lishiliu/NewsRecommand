package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.KeyType;
import cn.liyz.NewsRecommend.entity.User;

import java.util.List;

/**
 * Created by liyan on 2018/7/10.
 */
public interface KeyTypeDao {
    /**
     * 添加关键字
     */
    int insert(KeyType keyType);

    /**
     * 根据id删除关键字
     */
    int deleteById(int id);

    /**
     * 修改关键字
     */
    int update(KeyType keyType);

    /**
     * 根据id查询关键字
     */
    KeyType selectById(int id);

    /**
     * 根据keyType查询
     */
    KeyType selectByKeyType(String keyType);

    /**
     * 获取所有KeyType
     */
    List<KeyType> selectAllKeyType();
}
