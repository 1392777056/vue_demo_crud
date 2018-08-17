package com.taobao.service.impl;

import com.taobao.dao.UserDao;
import com.taobao.dao.UserMapper;
import com.taobao.domain.User;
import com.taobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 12:09
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    /**
     * 往redis添加key value
     * @return
     */
    @Cacheable(value = "findAll",key = "'user.findAll'")
    public List<User> findAll() {
        System.out.println("查询了数据库");

        List<User> list = userMapper.findAll();
        return list;
    }

    /**
     * 往redis删除key value
     * @param name
     * @return
     */
    @CacheEvict(value = "findAll",key = "'user.findAll'")
    public List<User> queryName(String name) {
        List<User> list = userDao.queryUserName(name);
        return  list;
    }


}
