package com.taobao.dao;

import com.taobao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 12:14
 */
public interface UserMapper extends JpaRepository<User,Long>,JpaSpecificationExecutor<User> {


}
