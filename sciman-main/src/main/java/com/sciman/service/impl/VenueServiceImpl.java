package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.VenueMapper;
import com.sciman.dto.venue.VenueQueryParam;
import com.sciman.dto.venue.VenueQueryResult;
import com.sciman.pojo.Venue;
import com.sciman.service.VenueService;
import com.sciman.vo.venue.VenueView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class VenueServiceImpl implements VenueService {
    private final VenueMapper venueMapper;

    @Override
    public List<Venue> getAllVenue() {
        return venueMapper.getAllVenue();
    }

    @Override
    public VenueQueryResult getVenueViewFor(VenueQueryParam queryParam) {
        log.info("queryParam: {}", queryParam);
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<VenueView> result = venueMapper.getVenueViewFor(
                queryParam.getLaboratoryNameFilter()
        );
        return new VenueQueryResult(result.getResult(), result.getTotal());
    }
}
