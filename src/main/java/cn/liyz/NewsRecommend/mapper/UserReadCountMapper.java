package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.UserReadCount;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/11.
 */
@Component
public interface UserReadCountMapper {

    int insert(UserReadCount userReadCount);

    int update(UserReadCount userReadCount);

    List<UserReadCount> selectByUserId(@Param("userId") int userId);

    List<UserReadCount> selectTopByUserId(@Param("userId") int userId);

}
