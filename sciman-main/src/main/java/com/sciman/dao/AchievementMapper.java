package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Achievement;
import com.sciman.vo.achievement.AchievementView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AchievementMapper {
    Page<AchievementView> getAchievementList(
        String nameFilter,
        Long projectId
    );

    AchievementView getAchievement(Long achievementId);

    List<AchievementView> getAllAchievement();

    @Select("select project_id from achievement where id = #{achievementId}")
    Long getProjectIdOfAchievementId(Long achievementId);

    Integer updateAchievement(AchievementView achievementView);

    @Delete("delete from achievement where id = #{achievementId}")
    Integer deleteAchievement(Long achievementId);

    Integer addAchievement(Achievement achievementView);
}
