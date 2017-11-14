package learn.spring.springboot.mapper.cluster;

import learn.spring.springboot.domain.News;
import learn.spring.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewsMapper {
    News findNewsById(@Param("id")int newsId);
}
