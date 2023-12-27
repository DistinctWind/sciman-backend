package com.sciman.dto.secretary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecretaryQueryParam {
    private String nameFilter;
    private Integer page;
    private Integer pageSize;
    public void normalize() {
        if (nameFilter != null && nameFilter.isEmpty()) nameFilter = null;
    }
}
