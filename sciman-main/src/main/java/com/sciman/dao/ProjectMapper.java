package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Project;
import com.sciman.vo.project.ProjectView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {
    @Select("select * from project")
    List<Project> getAllProjects();

    Page<ProjectView> getProjectViewsFor(
            String projectNameFilter,
            String mainResearcherNameFilter
    );

    ProjectView getProjectViewOf(
            Long projectId
    );

    @Select("select * from project where project_id = #{id}")
    Project getProjectById(Long id);
}
