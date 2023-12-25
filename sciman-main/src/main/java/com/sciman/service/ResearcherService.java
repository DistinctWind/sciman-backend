package com.sciman.service;

import com.sciman.dto.researcher.QueryParam;
import com.sciman.dto.researcher.QueryResult;
import com.sciman.vo.person.ResearcherView;

import java.util.List;

public interface ResearcherService {
    List<ResearcherView> listAllResearcherView();

    QueryResult listResearcherViewFor(QueryParam queryParam);
}
