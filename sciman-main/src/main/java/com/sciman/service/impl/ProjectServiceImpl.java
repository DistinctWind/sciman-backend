package com.sciman.service.impl;

import com.sciman.dao.ProjectMapper;
import com.sciman.pojo.Project;
import com.sciman.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectMapper projectMapper;
    @Override
    public List<Project> getAllProjects() {
        return projectMapper.getAllProjects();
    }
}
