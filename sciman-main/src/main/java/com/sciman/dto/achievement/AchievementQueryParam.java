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
    private String nameFilter;
    private Long projectId;

    public void normalize() {
        if (nameFilter != null && nameFilter.isEmpty()) nameFilter = null;
        if (projectId != null && projectId == 0) projectId = null;
    }
}
