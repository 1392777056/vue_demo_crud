package com.taobao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 11:44
 */

/**
 * 引导类
 */
@SpringBootApplication
@EnableCaching  // 开启缓存
public class SpringBootApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationRunner.class,args);
    }

}
