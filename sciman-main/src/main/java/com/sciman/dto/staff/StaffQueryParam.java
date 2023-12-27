package com.sciman.dto.staff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffQueryParam {
    private String nameFilter;
    private String laboratoryFilter;
    private Integer page;
    private Integer pageSize;

    public void normalize() {
        if (nameFilter.isEmpty()) {
            nameFilter = null;
        }
        if (laboratoryFilter.isEmpty()) {
            laboratoryFilter = null;
        }
    }
}
