package com.sciman.service;

import com.sciman.dto.achievement.AchievementQueryParam;
import com.sciman.dto.achievement.AchievementQueryResult;

public interface AchievementService {
    AchievementQueryResult getAchievementList(AchievementQueryParam queryParam);
}
