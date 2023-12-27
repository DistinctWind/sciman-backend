package com.sciman.vo.venue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueView {
    private Long id;
    private String laboratoryName;
    private Double area;
    private String address;
}
