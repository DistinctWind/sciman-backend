package com.sciman.dao;

import com.sciman.dto.login.LoginParam;
import com.sciman.vo.member.member.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select * from administrator where username = #{username} and password = #{password}")
    Administrator loginAsAdministrator(String username, String password);
}
