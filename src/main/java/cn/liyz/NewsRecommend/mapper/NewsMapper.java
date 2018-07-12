package cn.liyz.NewsRecommend.mapper;

import cn.liyz.NewsRecommend.entity.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liyan on 2018/7/11.
 */
@Component
public interface NewsMapper {

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
    News selectById(@Param("id") int id);

    /**
     * 模糊查询
     * @return
     * @param sname
     */
    List<News> selectByRequest(String sname);


}
