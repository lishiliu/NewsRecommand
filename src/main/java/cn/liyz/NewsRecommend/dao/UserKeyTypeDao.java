package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.UserKeyType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liyan on 2018/7/10.
 */
public interface UserKeyTypeDao {

    int insert(UserKeyType userKeyType);

    int delete(@Param("userId") int userId, @Param("keyTypeId") int keyTypeId);

    List<UserKeyType> selectByUserId(@Param("userId") int userId);

}
