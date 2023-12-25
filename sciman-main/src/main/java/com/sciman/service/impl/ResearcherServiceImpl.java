package com.sciman.service.impl;

import com.sciman.dao.ResearcherMapper;
import com.sciman.dto.researcher.QueryParam;
import com.sciman.service.ResearcherService;
import com.sciman.vo.person.ResearcherView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ResearcherServiceImpl implements ResearcherService {
    private final ResearcherMapper researcherMapper;

    @Override
    public List<ResearcherView> listResearcherViewFor(QueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
        return researcherMapper.listResearcherView(
                queryParam.getNameFilter(),
                queryParam.getLimitStart(),
                queryParam.getLimitSize()
        );
    }

    @Override
    public List<ResearcherView> listAllResearcherView() {
        return researcherMapper.listAllResearcherView();
    }
}
