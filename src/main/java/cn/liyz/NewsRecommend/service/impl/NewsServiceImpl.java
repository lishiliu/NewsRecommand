package cn.liyz.NewsRecommend.service.impl;

import cn.liyz.NewsRecommend.dao.NewsDao;
import cn.liyz.NewsRecommend.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liyan on 2018/7/11.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired NewsDao newsDao;




}
