package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ContactMapper {
    @Select("select * from contact where id = #{id}")
    Contact getContactById(Long id);

    Integer updateContact(Contact contact);
}
