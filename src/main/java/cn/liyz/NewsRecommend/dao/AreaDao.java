package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
public interface AreaDao {
    int insert(Area area);

    Area selectById(int id);

    Area selectByAreaName(String areaName);

    List<Area> selectAllArea();
}
