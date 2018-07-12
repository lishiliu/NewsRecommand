package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.NewsAreaDao;
import cn.liyz.NewsRecommend.entity.NewsArea;
import cn.liyz.NewsRecommend.mapper.NewsAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Repository
public class NewsAreaDaoImpl implements NewsAreaDao{

    @Autowired NewsAreaMapper newsAreaMapper;
    public int insert(NewsArea newsArea) {
        return newsAreaMapper.insert(newsArea);
    }

    public int delete(int userId, int areaId) {
        return newsAreaMapper.delete(userId,areaId);
    }

    public List<NewsArea> selectByAreaId(int areaId) {
        return newsAreaMapper.selectByAreaId(areaId);
    }
}
