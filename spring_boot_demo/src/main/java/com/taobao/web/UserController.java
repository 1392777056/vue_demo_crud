package com.taobao.web;

import com.taobao.domain.User;
import com.taobao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 11:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 整合spring data jpa
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {

        return userService.findAll();

    }

    /**
     * 整合spring mybatis
     * @param name
     * @return
     */
    @RequestMapping("/findByName/{name}")
    public List<User> findAll(@PathVariable String name) {

        return userService.queryName(name);

    }


}
