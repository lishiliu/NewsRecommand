package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.NewsArea;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Component
public interface NewsAreaMapper {
    int insert(NewsArea newsArea);

    int delete(@Param("newsId") int userId, @Param("areaId") int areaId);

    List<NewsArea> selectByAreaId(@Param("areaId") int areaId);
}
