package com.example.shao.dao;


import com.example.shao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * User映射类
 * Created by Dell on 2019/04/23
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USERS WHERE id = #{id}")
    User findUserById(@Param("id") Integer id);

}


