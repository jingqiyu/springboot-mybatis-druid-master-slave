package learn.spring.springboot.mapper.master;

import learn.spring.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(int userId);
}
