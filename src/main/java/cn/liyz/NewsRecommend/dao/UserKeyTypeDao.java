package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.UserKeyType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liyan on 2018/7/10.
 */
public interface UserKeyTypeDao {

    int insert(UserKeyType userKeyType);

    int delete( int userId,  int keyTypeId);

    List<UserKeyType> selectByUserId( int userId);

}
