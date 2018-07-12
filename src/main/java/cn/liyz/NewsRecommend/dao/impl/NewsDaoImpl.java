package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.NewsDao;
import cn.liyz.NewsRecommend.entity.News;
import cn.liyz.NewsRecommend.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/11.
 */
@Repository
public class NewsDaoImpl implements NewsDao {

    @Autowired NewsMapper newsMapper;

    public int insert(News news) {
        return newsMapper.insert(news);
    }

    public List<News> selectAllNews() {
        return newsMapper.selectAllNews();
    }

    public News selectById(int id) {
        return newsMapper.selectById(id);
    }

    public List<News> selectByRequest(String sname) {
        return newsMapper.selectByRequest(sname);
    }
}
