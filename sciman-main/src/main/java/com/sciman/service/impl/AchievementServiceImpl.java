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

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements AchievementService {
    private final AchievementMapper achievementMapper;

    @Override
    public AchievementQueryResult getAchievementList(AchievementQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<AchievementView> achievement = achievementMapper.getAchievementList(
                queryParam.getNameFilter(),
                queryParam.getProjectId()
        );
        return new AchievementQueryResult(achievement.getResult(), achievement.getTotal());
    }

    @Override
    public List<AchievementView> getAllAchievement() {
        return achievementMapper.getAllAchievement();
    }
}
