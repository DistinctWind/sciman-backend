package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.AchievementMapper;
import com.sciman.dto.achievement.AchievementQueryParam;
import com.sciman.dto.achievement.AchievementQueryResult;
import com.sciman.service.AchievementService;
import com.sciman.vo.achievement.AchievementView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements AchievementService {
    private final AchievementMapper achievementMapper;

    @Override
    public AchievementQueryResult getAchievementList(AchievementQueryParam queryParam) {
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<AchievementView> achievement = achievementMapper.getAchievementList();
        return new AchievementQueryResult(achievement.getResult(), achievement.getTotal());
    }
}