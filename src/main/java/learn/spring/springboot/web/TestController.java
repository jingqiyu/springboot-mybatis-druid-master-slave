package learn.spring.springboot.web;

import learn.spring.springboot.domain.User;
import learn.spring.springboot.mapper.master.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/get/{userId}")
    public User testGet(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }

}
