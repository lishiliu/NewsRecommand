package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.UserKeyType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Component
public interface NewsTypeMapper {

    int insert(UserKeyType userKeyType);

    int delete(@Param("newsId") int userId, @Param("typeId") int keyTypeId);

    List<UserKeyType> selectByTypeId(@Param("userId") int userId);
}
