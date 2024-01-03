package com.sciman.service;

import com.sciman.dto.achievement.AchievementQueryParam;
import com.sciman.dto.achievement.AchievementQueryResult;
import com.sciman.pojo.Achievement;
import com.sciman.vo.achievement.AchievementView;

import java.util.List;

public interface AchievementService {
    AchievementQueryResult getAchievementList(AchievementQueryParam queryParam);
    List<AchievementView> getAllAchievement();
    AchievementView getDetailOfAchievement(Long achievementId);
    boolean updateAchievement(AchievementView achievementView);
    boolean deleteAchievement(Long achievementId);
    boolean addAchievement(Achievement achievementView);
}
