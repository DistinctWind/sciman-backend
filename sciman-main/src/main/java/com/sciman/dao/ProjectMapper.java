package com.sciman.dao;

import com.sciman.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {
    @Select("select * from project")
    List<Project> getAllProjects();

}
