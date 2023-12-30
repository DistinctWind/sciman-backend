package com.sciman.controller;

import com.sciman.dto.project.ProjectQueryParam;
import com.sciman.service.ProjectService;
import com.sciman.utils.result.Result;
import com.sciman.vo.project.ProjectDetailView;
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

    @GetMapping("/detail/{id}")
    public Result detailOf(@PathVariable Long id) {
        ProjectDetailView result = projectService.getProjectDetailViewOf(id);
        if (result == null) {
            return Result.fail("项目不存在");
        }
        return Result.success(result);
    }

    @GetMapping("/view/{id}")
    public Result projectViewOf(@PathVariable Long id) {
        return Result.success(projectService.getProjectViewOf(id));
    }
}
