package learn.spring.springboot.service;

import learn.spring.springboot.domain.News;
import org.apache.ibatis.annotations.Param;

public interface NewsService {
    News findNewsById(int newsId);
}
