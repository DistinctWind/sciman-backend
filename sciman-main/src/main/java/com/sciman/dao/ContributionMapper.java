package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.vo.contribution.ContributionView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ContributionMapper {
    Page<ContributionView> getContributionList(
            Long achievementId
    );
}
