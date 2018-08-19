package com.vuedemo.dao;

import com.vuedemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/19 15:41
 */
public interface UserDao extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
}
