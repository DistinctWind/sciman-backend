package com.sciman.dto.organization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationQueryParam {
    private Integer page;
    private Integer pageSize;
    private String nameFilter;

    public void normalize() {
        if (nameFilter != null && nameFilter.isEmpty()) {
            nameFilter = null;
        }
    }
}
