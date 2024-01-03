package com.sciman.service;

import com.sciman.dto.researcher.ResearcherListParam;
import com.sciman.dto.researcher.ResearcherQueryParam;
import com.sciman.dto.researcher.ResearcherViewQueryResult;
import com.sciman.pojo.Researcher;
import com.sciman.vo.person.ResearcherView;

import java.util.List;

public interface ResearcherService {
    List<ResearcherView> listAllResearcherView(
            ResearcherListParam listParam
    );

    ResearcherViewQueryResult listResearcherViewFor(ResearcherQueryParam queryParam);

    Researcher getResearcher(Long id);

    ResearcherView getResearcherView(Long id);

    boolean modifyResearcher(Researcher researcher);

    boolean deleteResearcher(Long id);
    boolean insertResearcher(Researcher researcher);
}
