package com.sciman.vo.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAttendanceView {
    private Long id;
    private Long researcherId;
    private String researcherName;
    private String projectName;
}
