package com.sciman.dto.achievement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchievementQueryParam {
    private Integer page;
    private Integer pageSize;
}
