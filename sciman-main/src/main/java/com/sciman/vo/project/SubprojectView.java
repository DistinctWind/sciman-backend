package com.sciman.vo.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubprojectView {
    private Long id;
    private String projectName;
    private String principalResearcherName;
    private LocalDate dueDate;
    private Integer budget;
    private String techDescription;
}
