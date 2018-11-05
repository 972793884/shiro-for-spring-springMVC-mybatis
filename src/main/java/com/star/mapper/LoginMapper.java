package com.star.mapper;

import com.star.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select * from user where name=#{name}")
    User findByName(String name);



}
