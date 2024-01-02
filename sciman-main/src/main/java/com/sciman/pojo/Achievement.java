package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Achievement {
    private Long id;
    private String name;
    private Long projectId;
    private LocalDate achieveDate;
    private Double rankingFactor;
    private Integer classification;
}
