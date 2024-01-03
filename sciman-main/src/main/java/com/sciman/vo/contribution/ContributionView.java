package com.sciman.vo.contribution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContributionView {
    private Long id;
    private String researcherName;
    private String achievementName;
}
