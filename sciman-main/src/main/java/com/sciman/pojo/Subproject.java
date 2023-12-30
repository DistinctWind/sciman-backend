package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subproject {
    private Long id;
    private Long projectId;
    private Long principalId;
    private LocalDate dueDate;
    private Integer budget;
    private String techDescription;
}
