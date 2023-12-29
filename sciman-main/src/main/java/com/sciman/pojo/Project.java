package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Long projectId;
    private Long mainResearcherId;
    private String name;
    private String content;
    private Integer budget;
    private LocalDate beginDate;
    private LocalDate endDate;
    private Long clientOrganizationId;
    private Long monitorOrganizationId;
}
