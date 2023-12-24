package com.sciman.service;

import com.sciman.dto.researcher.QueryParam;
import com.sciman.vo.person.ResearcherView;

import java.util.List;

public interface ResearcherService {
    List<ResearcherView> listAllResearcherView();

    List<ResearcherView> listResearcherViewFor(QueryParam queryParam);
}
