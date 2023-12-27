package com.sciman.dto.laboratory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LaboratoryQueryParam {
    private Integer page;
    private Integer pageSize;

    public void normalize() {

    }
}
