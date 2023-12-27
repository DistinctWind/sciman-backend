package com.sciman.service.impl;

import com.sciman.dao.CountMapper;
import com.sciman.service.CountService;
import com.sciman.vo.count.CountData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountServiceImpl implements CountService {
    private final CountMapper countMapper;
    @Override
    public CountData getObjectCount() {
        CountData countData = new CountData();
        countData.setLaboratory(countMapper.getLaboratoryCount());
        countData.setResearcher(countMapper.getResearcherCount());
        countData.setSecretary(countMapper.getSecretaryCount());
        countData.setVenue(countMapper.getVenueCount());
        return countData;
    }
}
