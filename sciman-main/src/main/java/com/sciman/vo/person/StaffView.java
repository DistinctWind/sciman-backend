package com.sciman.vo.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffView {
    private Long id;
    private String researcherName;
    private String laboratoryName;
    private LocalDate dueDate;
}
