package com.sciman.controller;

import com.sciman.dto.achievement.AchievementQueryParam;
import com.sciman.service.AchievementService;
import com.sciman.utils.result.Result;
import com.sciman.vo.achievement.AchievementView;
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

    @GetMapping("/listAll")
    public Result getAllAchievement() {
        return Result.success(achievementService.getAllAchievement());
    }

    @GetMapping("/detail/{achievementId}")
    public Result getDetailOfAchievement(@PathVariable Long achievementId) {
        return Result.success(achievementService.getDetailOfAchievement(achievementId));
    }

    @PostMapping("/update")
    public Result updateAchievement(@RequestBody AchievementView achievementView) {
        if (achievementService.updateAchievement(achievementView)) {
            return Result.success();
        } else {
            return Result.fail("更新失败");
        }
    }

    @DeleteMapping("/delete/{achievementId}")
    public Result deleteAchievement(@PathVariable Long achievementId) {
        if (achievementService.deleteAchievement(achievementId)) {
            return Result.success();
        } else {
            return Result.fail("删除失败");
        }
    }
}
