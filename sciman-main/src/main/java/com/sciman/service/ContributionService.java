package com.sciman.service;

import com.sciman.dto.contribution.ContributionQueryParam;
import com.sciman.dto.contribution.ContributionQueryResult;

public interface ContributionService {
    ContributionQueryResult listContribution(ContributionQueryParam queryParam);
}
