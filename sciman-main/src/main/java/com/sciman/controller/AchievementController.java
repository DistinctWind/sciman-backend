package com.sciman.controller;

import com.sciman.dto.achievement.AchievementQueryParam;
import com.sciman.service.AchievementService;
import com.sciman.utils.result.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/achievement")
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class AchievementController {
    private final AchievementService achievementService;
    @PostMapping("/list")
    public Result getAchievementList(@RequestBody AchievementQueryParam queryParam) {
        return Result.success(achievementService.getAchievementList(queryParam));
    }
}
