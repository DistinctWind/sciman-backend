package com.sciman.dto.achievement;

import com.sciman.vo.achievement.AchievementView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchievementQueryResult {
    private List<AchievementView> achievement;
    private Long total;
}
