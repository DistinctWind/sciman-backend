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

    public void normalize() {

    }
}
