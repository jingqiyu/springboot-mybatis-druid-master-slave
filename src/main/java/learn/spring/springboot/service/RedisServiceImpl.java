package learn.spring.springboot.service;

import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisServiceImpl implements  RedisService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public void setString(String key, Object value) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value);

    }

    @Override
    public Object getString(String key) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }

    @Override
    public void lPushList(String listKey, Object value) {
        ListOperations<String, Object> stringStringListOperations = redisTemplate.opsForList();
        stringStringListOperations.leftPush(listKey,value);
    }
}
