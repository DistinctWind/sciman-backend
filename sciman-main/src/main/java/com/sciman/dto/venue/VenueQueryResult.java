package com.sciman.dto.venue;

import com.sciman.vo.venue.VenueView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueQueryResult {
    private List<VenueView> venue;
    private Long total;
}
