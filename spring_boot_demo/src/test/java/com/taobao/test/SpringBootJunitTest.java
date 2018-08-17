package com.taobao.test;

import com.taobao.SpringBootApplicationRunner;
import com.taobao.domain.User;
import com.taobao.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 14:54
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootApplicationRunner.class)
public class SpringBootJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void getCond() {

        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println(user.getName());
        }

    }

}
