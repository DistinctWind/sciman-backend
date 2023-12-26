package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Secretary {
    private Integer employeeId;
    private String name;
    private Integer gender;
    private Integer age;
    private LocalDate employDate;
    private String duty;
}
