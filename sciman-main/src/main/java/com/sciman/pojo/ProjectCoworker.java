package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectCoworker {
    private Long id;
    private Long projectId;
    private Long coworkerId;
}
