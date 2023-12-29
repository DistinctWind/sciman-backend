package com.sciman.dto.project;


import com.sciman.vo.project.ProjectView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectViewQueryResult {
    private Long total;
    private List<ProjectView> projects;
}
