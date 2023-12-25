package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Researcher {
    private Long employeeId;
    private Long laboratoryId;
    private String name;
    private Integer gender;
    private String title;
    private Integer age;
    private String orientation;
}
