package learn.spring.springboot.service;

import learn.spring.springboot.domain.News;
import learn.spring.springboot.mapper.cluster.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired private NewsMapper newsMapper;

    @Override
    public News findNewsById(int newsId) {
        return  newsMapper.findNewsById(newsId);
    }
}
