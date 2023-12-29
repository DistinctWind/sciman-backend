package com.sciman.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectQueryParam {
    private Integer page;
    private Integer pageSize;

    public void normalize() {

    }
}
