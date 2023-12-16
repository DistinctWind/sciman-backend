package com.sciman.service.impl;

import com.sciman.dao.ResearcherMapper;
import com.sciman.service.ResearcherService;
import com.sciman.vo.person.ResearcherView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResearcherServiceImpl implements ResearcherService {
    private final ResearcherMapper researcherMapper;
    @Override
    public List<ResearcherView> listAllResearcherView() {
        return researcherMapper.listAllResearcherView();
    }
}
