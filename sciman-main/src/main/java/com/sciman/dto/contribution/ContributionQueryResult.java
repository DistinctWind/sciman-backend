package com.sciman.dto.contribution;

import com.sciman.vo.contribution.ContributionView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContributionQueryResult {
    private List<ContributionView> contribution;
    private Long total;
}
