package com.sciman.dto.venue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueQueryParam {
    private Integer page;
    private Integer pageSize;
    private String laboratoryName;

    public void normalize() {
        if (laboratoryName != null && laboratoryName.isEmpty()) {
            laboratoryName = null;
        }
    }
}
