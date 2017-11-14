package learn.spring.springboot.service;

public interface RedisService {
    public void setString(String key,Object value);
    public Object getString(String key);
    public void lPushList(String listKey, Object value);
}
