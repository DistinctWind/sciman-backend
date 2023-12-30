package com.sciman.vo.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectCoworkerView {
    private Long id;
    private String projectName;
    private String coworkerName;
}
