package com.sciman.service;

import com.sciman.dto.contribution.ContributionQueryParam;
import com.sciman.dto.contribution.ContributionQueryResult;
import com.sciman.pojo.Contribution;

public interface ContributionService {
    ContributionQueryResult listContribution(ContributionQueryParam queryParam);
    boolean deleteContribution(Long id);
    boolean addContribution(Contribution contribution);
}
