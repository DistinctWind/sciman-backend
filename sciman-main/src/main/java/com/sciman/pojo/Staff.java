package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    private Long id;
    private Long researcherId;
    private Long laboratoryId;
    private LocalDate dueDate;
}
