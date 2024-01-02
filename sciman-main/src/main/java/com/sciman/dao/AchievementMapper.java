package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.vo.achievement.AchievementView;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AchievementMapper {
    Page<AchievementView> getAchievementList(

    );
}
