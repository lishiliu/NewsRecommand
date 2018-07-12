package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.News;

import java.util.List;

/**
 * Created by liyan on 2018/7/11.
 */
public interface NewsDao {
    /**
     * 添加新闻
     * @param news
     * @return
     */
    int insert(News news);

    /**
     * 获取所有新闻
     * @return
     */
    List<News> selectAllNews();

    /**
     * 根据id查询新闻
     * @param id
     * @return
     */
    News selectById(int id);

    /**
     * 模糊查询
     * @param sname
     * @return
     */
    List<News> selectByRequest( String sname);

}
