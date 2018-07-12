package cn.liyz.NewsRecommend.dao.impl;

import cn.liyz.NewsRecommend.dao.AreaDao;
import cn.liyz.NewsRecommend.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liyan on 2018/7/12.
 */
@Repository
public class AreaDaoImpl implements AreaDao {
    @Autowired AreaDao areaDao;

    public int insert(Area area) {
        return areaDao.insert(area);
    }

    public Area selectById(int id) {
        return areaDao.selectById(id);
    }

    public Area selectByAreaName(String areaName) {
        return areaDao.selectByAreaName(areaName);
    }

    public List<Area> selectAllArea() {
        return areaDao.selectAllArea();
    }
}
