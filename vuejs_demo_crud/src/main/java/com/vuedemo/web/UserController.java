package com.vuedemo.web;

import com.vuedemo.domain.User;
import com.vuedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/19 15:38
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<User> findAll() {

        return userService.findAll();

    }

    @RequestMapping("findOne/{id}")
    public User findAll(@PathVariable Integer id) {

        return userService.findOne(id);

    }

}
