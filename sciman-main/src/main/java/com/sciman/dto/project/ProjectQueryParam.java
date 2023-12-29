package com.sciman.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectQueryParam {
    private Integer page;
    private Integer pageSize;
    private String projectNameFilter;
    private String mainResearcherNameFilter;

    public void normalize() {
        if (projectNameFilter != null && projectNameFilter.isEmpty())
            projectNameFilter = null;
        if (mainResearcherNameFilter != null && mainResearcherNameFilter.isEmpty())
            mainResearcherNameFilter = null;
    }
}
