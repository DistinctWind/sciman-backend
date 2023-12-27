package com.sciman.service.impl;

import com.sciman.dao.VenueMapper;
import com.sciman.pojo.Venue;
import com.sciman.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VenueServiceImpl implements VenueService {
    private final VenueMapper venueMapper;

    @Override
    public List<Venue> getAllVenue() {
        return venueMapper.getAllVenue();
    }
}
