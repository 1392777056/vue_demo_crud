package com.taobao.service;

import com.taobao.domain.User;

import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 12:09
 */
public interface UserService  {

    List<User> findAll();

    List<User> queryName(String name);
}
