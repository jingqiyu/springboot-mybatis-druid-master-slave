package learn.spring.springboot.web;

import learn.spring.springboot.domain.User;
import learn.spring.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class TestRedisController {

    @Autowired
    RedisService redisService;

    @GetMapping("/put")
    public User put() {
        User user = new User();
        user.setId(1).setUserId(20).setScore(100);
        redisService.setString("test",user);
        return user;
    }

    @GetMapping("/get")
    public Object get() {
        Object test_redis = redisService.getString("test");
        return test_redis;
    }

}
