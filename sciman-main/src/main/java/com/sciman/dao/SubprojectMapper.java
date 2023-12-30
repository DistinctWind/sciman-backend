package com.sciman.dao;

import com.sciman.vo.project.SubprojectView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SubprojectMapper {
    List<SubprojectView> getSubprojectViewsOfProjectId(Long projectId);
}
