package com.sciman.controller;

import com.sciman.dto.project.ProjectQueryParam;
import com.sciman.service.ProjectService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
@CrossOrigin
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping("/listAll")
    public Result listAllProjects() {
        return Result.success(projectService.getAllProjects());
    }

    @PostMapping("/list")
    public Result listProjects(@RequestBody ProjectQueryParam queryParam) {
        return Result.success(projectService.getProjectViewsFor(queryParam));
    }
}
