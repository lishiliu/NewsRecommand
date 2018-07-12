package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.UserReadCount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
public interface UserReadCountDao {
    int insert(UserReadCount userReadCount);

    int update(UserReadCount userReadCount);

    List<UserReadCount> selectByUserId(int userId);

    List<UserReadCount> selectTopByUserId(int userId);
}
