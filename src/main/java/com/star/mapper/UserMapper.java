package com.star.mapper;

import com.star.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,password,is_delete,is_locked,duty,sign_in_time) values(#{name},#{password},0,0,#{duty},#{signInTime})")
    Integer save(User user);

    @Update("update user set name=#{name},password=#{password},nick_name=#{nickName},is_delete=#{isDelete},is_locked=#{isLocked},duty=#{duty},bind_id=#{bindId},sign_in_time=#{signInTime},last_login_time=#{lastLoginTime},this_login_time=#{thisLoginTime} where id=#{id}")
    Integer update(User user);
}
