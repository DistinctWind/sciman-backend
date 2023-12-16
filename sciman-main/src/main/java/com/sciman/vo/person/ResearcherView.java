package com.sciman.vo.person;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResearcherView {
    private Integer employeeId;
    private String laboratoryName;
    private String name;
    private Integer gender;
    private Integer age;
}
