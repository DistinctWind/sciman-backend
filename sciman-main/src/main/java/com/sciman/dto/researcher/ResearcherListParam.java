package com.sciman.dto.researcher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResearcherListParam {
    private Long laboratoryId;
    private Long achievementId;

    public void normalize() {
        if (laboratoryId != null && laboratoryId == 0) {
            laboratoryId = null;
        }
        if (achievementId != null && achievementId == 0) {
            achievementId = null;
        }
    }
}
