package com.sciman.dto.contribution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContributionQueryParam {
    private Long achievementId;
    private Integer page;
    private Integer pageSize;

    public void normalize() {
        if (achievementId == 0) {
            achievementId = null;
        }
    }
}
