package cn.liyz.NewsRecommend.service;

import cn.liyz.NewsRecommend.entity.KeyType;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
public interface KeyTypeService {
    List<KeyType> getAllKeyType( );

    int deleteUserKeyType(int userId,String keyType);
}
