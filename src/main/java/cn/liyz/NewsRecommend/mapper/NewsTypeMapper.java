package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.NewsType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Component
public interface NewsTypeMapper {

    int insert(NewsType newsType);

    int delete(@Param("newsId") int userId, @Param("typeId") int typeId);

    List<NewsType> selectByTypeId(@Param("typeId") int typeId);
}
