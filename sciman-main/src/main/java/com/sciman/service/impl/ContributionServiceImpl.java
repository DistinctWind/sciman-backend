package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.ContributionMapper;
import com.sciman.dto.contribution.ContributionQueryParam;
import com.sciman.dto.contribution.ContributionQueryResult;
import com.sciman.service.ContributionService;
import com.sciman.vo.contribution.ContributionView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContributionServiceImpl implements ContributionService {
    private final ContributionMapper contributionMapper;

    @Override
    public ContributionQueryResult listContribution(ContributionQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<ContributionView> result = contributionMapper.getContributionList(
                queryParam.getAchievementId()
        );
        return new ContributionQueryResult(result.getResult(), result.getTotal());
    }
}
