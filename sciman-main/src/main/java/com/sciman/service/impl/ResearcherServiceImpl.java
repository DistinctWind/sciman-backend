package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.ResearcherMapper;
import com.sciman.dto.researcher.ResearcherQueryParam;
import com.sciman.dto.researcher.ResearcherViewQueryResult;
import com.sciman.pojo.Researcher;
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
    public ResearcherViewQueryResult listResearcherViewFor(ResearcherQueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<ResearcherView> result = researcherMapper.listResearcherView(
                queryParam.getNameFilter(),
                queryParam.getLaboratoryNameFilter()
        );
        return new ResearcherViewQueryResult(result.getResult(), result.getTotal());
    }

    @Override
    public ResearcherView getResearcherView(Long id) {
        log.info("querying researcher view with id: {}", id);
        return researcherMapper.getResearcherViewFor(id);
    }

    @Override
    public Researcher getResearcher(Long id) {
        log.info("querying researcher with id: {}", id);
        return researcherMapper.getResearcherId(id);
    }

    @Override
    public boolean deleteResearcher(Long id) {
        log.info("deleting researcher with id: {}", id);
        return researcherMapper.deleteResearcher(id) == 1;
    }

    @Override
    public boolean insertResearcher(Researcher researcher) {
        log.info("inserting researcher: {}", researcher);
        return researcherMapper.insertResearcher(researcher) == 1;
    }

    @Override
    public boolean modifyResearcher(Researcher researcher) {
        log.info("modifying researcher: {}", researcher);
        return researcherMapper.updateResearcher(researcher) == 1;
    }

    @Override
    public List<ResearcherView> listAllResearcherView(Long laboratoryId) {
        return researcherMapper.listAllResearcherView(laboratoryId);
    }
}
