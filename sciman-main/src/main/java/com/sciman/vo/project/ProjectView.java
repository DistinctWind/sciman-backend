package com.sciman.vo.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectView {
    private Long projectId;
    private String mainResearcherName;
    private String name;
    private LocalDate beginDate;
    private LocalDate endDate;
    private Integer budget;
    private String clientOrganizationName;
}
