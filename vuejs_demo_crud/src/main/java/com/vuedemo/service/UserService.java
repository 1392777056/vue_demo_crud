package com.vuedemo.service;

import com.vuedemo.domain.User;

import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/19 15:40
 */
public interface UserService {

    List<User> findAll();

    User findOne(Integer id);
}
