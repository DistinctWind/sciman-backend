package com.sciman.dao;

import com.sciman.pojo.Laboratory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LabMapper {
    @Select("select * from laboratory")
    List<Laboratory> getAllLabs();
}
