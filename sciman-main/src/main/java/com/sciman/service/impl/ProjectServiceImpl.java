package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.ProjectMapper;
import com.sciman.dto.project.ProjectQueryParam;
import com.sciman.dto.project.ProjectViewQueryResult;
import com.sciman.pojo.Project;
import com.sciman.service.ProjectService;
import com.sciman.vo.project.ProjectView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectMapper projectMapper;

    @Override
    public ProjectViewQueryResult getProjectViewsFor(ProjectQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<ProjectView> projectViews = projectMapper.getProjectViewsFor(
                queryParam.getProjectNameFilter()
        );
        return new ProjectViewQueryResult(projectViews.getTotal(), projectViews.getResult());
    }

    @Override
    public List<Project> getAllProjects() {
        return projectMapper.getAllProjects();
    }
}
