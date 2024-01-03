package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.vo.contribution.ContributionView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ContributionMapper {
    Page<ContributionView> getContributionList(
            Long achievementId
    );

    @Delete("delete from achievement_contribution where id = #{id}")
    Integer deleteContributions(
            Long id
    );

    @Insert("insert into achievement_contribution (achievement_id, researcher_id) values (#{achievementId}, " +
            "#{researcherId})")
    Integer insertContribution(
            Long achievementId,
            Long researcherId
    );
}
