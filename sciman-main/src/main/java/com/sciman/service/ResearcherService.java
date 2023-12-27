package com.sciman.service;

import com.sciman.dto.researcher.ResearcherQueryParam;
import com.sciman.dto.researcher.ResearcherViewQueryResult;
import com.sciman.pojo.Researcher;
import com.sciman.vo.person.ResearcherView;

import java.util.List;

public interface ResearcherService {
    List<ResearcherView> listAllResearcherView();

    ResearcherViewQueryResult listResearcherViewFor(ResearcherQueryParam queryParam);

    Researcher getResearcherView(Long id);

    boolean modifyResearcher(Researcher researcher);

    boolean deleteResearcher(Long id);
}
