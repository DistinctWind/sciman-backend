package com.sciman.dao;

import com.sciman.vo.member.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LoginMapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    User loginAsAdministrator(String username, String password);

    @Update("update user set password = #{password} where id = #{id}")
    Integer updatePassword(Integer id, String password);
}
