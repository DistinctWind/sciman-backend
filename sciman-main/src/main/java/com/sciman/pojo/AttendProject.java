package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttendProject {
    private Long id;
    private Long researcherId;
    private Long projectId;
    private Long workTime;
    private Long workAmount;
}
