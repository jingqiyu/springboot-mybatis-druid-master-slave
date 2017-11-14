package learn.spring.springboot.web;

import learn.spring.springboot.domain.News;
import learn.spring.springboot.domain.User;
import learn.spring.springboot.mapper.master.UserMapper;
import learn.spring.springboot.service.NewsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private NewsService newsService;

    @GetMapping("/get/{userId}")
    public User testGet(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }

    @GetMapping("/get1/{userId}")
    public User testGet1(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }

    @GetMapping("/get2/{userId}")
    public User testGet2(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }
    @GetMapping("/get3/{userId}")
    public User testGet3(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }
    @GetMapping("/get4/{userId}")
    public User testGet4(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }
    @GetMapping("/get5/{userId}")
    public User testGet5(@Param("userId") Integer userId){
        System.out.println(userId);
        return userMapper.findUserById(1);
    }

    @GetMapping("/news/{id}")
    public News getNews(@PathVariable("id") Integer id){
        return newsService.findNewsById(id);
    }

}
