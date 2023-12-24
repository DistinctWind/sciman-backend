package com.sciman.dto.researcher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryParam {
    private String nameFilter;

    public void normalize() {
        if (nameFilter != null && nameFilter.isEmpty()) {
            nameFilter = null;
        }
    }
}
