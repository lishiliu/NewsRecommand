package cn.liyz.NewsRecommend.dao;

import cn.liyz.NewsRecommend.entity.NewsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
public interface NewsTypeDao {
    int insert(NewsType newsType);

    int delete(int userId, int typeId);

    List<NewsType> selectByTypeId(int typeId);
}
