package com.sciman.vo.lab;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaboratoryIntroduction {
    private Integer id;
    private String laboratoryName;
    private String stuffName;
    private String secretaryName;
}
