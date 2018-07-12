package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.Area;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Component
public interface AreaMapper {

    int insert(Area area);

    Area selectById(@Param("id") int id);

    Area selectByAreaName(@Param("areaName")String areaName);

    List<Area> selectAllArea();

}
