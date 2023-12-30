package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.AttendProjectMapper;
import com.sciman.dao.ProjectMapper;
import com.sciman.dao.ResearcherMapper;
import com.sciman.dto.project.ProjectQueryParam;
import com.sciman.dto.project.ProjectViewQueryResult;
import com.sciman.pojo.Project;
import com.sciman.service.OrganizationService;
import com.sciman.service.ProjectService;
import com.sciman.vo.project.ProjectDetailView;
import com.sciman.vo.project.ProjectView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectMapper projectMapper;
    private final OrganizationService organizationService;
    private final ResearcherMapper researcherMapper;
    private final AttendProjectMapper attendProjectMapper;

    @Override
    public ProjectDetailView getProjectDetailViewOf(Long projectId) {
        Project project = projectMapper.getProjectById(projectId);
        ProjectDetailView result = new ProjectDetailView();
        result.setProject(getProjectViewOf(projectId));
        result.setClientOrganization(
                organizationService.getOrganizationViewByOrganizationId(
                    project.getClientOrganizationId()
                )
        );
        result.setMainResearcher(
            researcherMapper.getResearcherViewFor(project.getMainResearcherId())
        );
        result.setProjectAttendances(
                attendProjectMapper.getProjectAttendanceViewOfProjectId(projectId)
        );
        return result;
    }

    @Override
    public ProjectView getProjectViewOf(Long projectId) {
        return projectMapper.getProjectViewOf(projectId);
    }

    @Override
    public ProjectViewQueryResult getProjectViewsFor(ProjectQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<ProjectView> projectViews = projectMapper.getProjectViewsFor(
                queryParam.getProjectNameFilter(),
                queryParam.getMainResearcherNameFilter()
        );
        return new ProjectViewQueryResult(projectViews.getTotal(), projectViews.getResult());
    }

    @Override
    public List<Project> getAllProjects() {
        return projectMapper.getAllProjects();
    }
}
