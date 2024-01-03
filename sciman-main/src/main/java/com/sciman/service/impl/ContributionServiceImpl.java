package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.ContributionMapper;
import com.sciman.dto.contribution.ContributionQueryParam;
import com.sciman.dto.contribution.ContributionQueryResult;
import com.sciman.pojo.Contribution;
import com.sciman.service.ContributionService;
import com.sciman.vo.contribution.ContributionView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ContributionServiceImpl implements ContributionService {
    private final ContributionMapper contributionMapper;

    @Override
    public boolean addContribution(Contribution contribution) {
        if (contribution.getAchievementId() == 0) {
            return false;
        }
        return contributionMapper.insertContribution(
                contribution.getAchievementId(),
                contribution.getResearcherId()
        ) > 0;
    }

    @Override
    public boolean deleteContribution(Long id) {
        return contributionMapper.deleteContributions(id) > 0;
    }

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
