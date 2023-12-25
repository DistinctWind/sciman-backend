package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sciman.dao.ResearcherMapper;
import com.sciman.dto.researcher.QueryParam;
import com.sciman.dto.researcher.QueryResult;
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
    public QueryResult listResearcherViewFor(QueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
            PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<ResearcherView> result = researcherMapper.listResearcherView(
                queryParam.getNameFilter()
        );
        return new QueryResult(result.getResult(), result.getTotal());
    }

    @Override
    public List<ResearcherView> listAllResearcherView() {
        return researcherMapper.listAllResearcherView();
    }
}
