package com.taobao.dao;

import com.taobao.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Create with www.dezhe.com
 *
 * @Author 德哲
 * @Date 2018/8/17 14:34
 */
@Mapper
public interface UserDao {

    @Select("select * from user where name like '%${value}%'")
    public List<User> queryUserName(String name);

}
