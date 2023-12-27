package com.sciman.service;

import com.sciman.dto.venue.VenueQueryParam;
import com.sciman.dto.venue.VenueQueryResult;
import com.sciman.pojo.Venue;

import java.util.List;

public interface VenueService {
    List<Venue> getAllVenue();

    VenueQueryResult getVenueViewFor(VenueQueryParam queryParam);
}
