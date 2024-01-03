package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.vo.achievement.AchievementView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AchievementMapper {
    Page<AchievementView> getAchievementList(
        String nameFilter,
        Long projectId
    );

    List<AchievementView> getAllAchievement();

    @Select("select project_id from achievement where id = #{achievementId}")
    Long getProjectIdOfAchievementId(Long achievementId);
}
