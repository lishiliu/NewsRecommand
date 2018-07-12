package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.NewsArea;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
public interface NewsAreaDao {

    int insert(NewsArea newsArea);

    int delete(int userId,int areaId);

    List<NewsArea> selectByAreaId(int areaId);
}
