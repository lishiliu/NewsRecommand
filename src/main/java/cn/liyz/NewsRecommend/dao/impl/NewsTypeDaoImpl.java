package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.NewsTypeDao;
import cn.liyz.NewsRecommend.entity.NewsType;
import cn.liyz.NewsRecommend.mapper.NewsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Repository
public class NewsTypeDaoImpl implements NewsTypeDao{

    @Autowired NewsTypeMapper newsTypeMapper;

    public int insert(NewsType newsType) {
        return newsTypeMapper.insert(newsType);
    }

    public int delete(int userId, int typeId) {
        return newsTypeMapper.delete(userId,typeId);
    }

    public List<NewsType> selectByTypeId(int typeId) {
        return newsTypeMapper.selectByTypeId(typeId);
    }
}
