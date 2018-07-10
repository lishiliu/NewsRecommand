package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.UserKeyType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/10.
 */
@Component
public interface UserKeyTypeMapper {

    int insert(UserKeyType userKeyType);

    int delete(@Param("userId") int userId, @Param("keyTypeId") int keyTypeId);

    List<UserKeyType> selectByUserId(@Param("userId") int userId);

}
