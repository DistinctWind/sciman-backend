package com.sciman.service;

import com.sciman.dto.project.ProjectQueryParam;
import com.sciman.dto.project.ProjectViewQueryResult;
import com.sciman.pojo.Project;
import com.sciman.vo.project.ProjectDetailView;
import com.sciman.vo.project.ProjectView;

import java.util.List;

public interface ProjectService {
    List<Project> getAllProjects();

    ProjectViewQueryResult getProjectViewsFor(ProjectQueryParam queryParam);
    ProjectView getProjectViewOf(Long projectId);
    ProjectDetailView getProjectDetailViewOf(Long projectId);
}
