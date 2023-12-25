package com.sciman.dto.researcher;

import com.sciman.vo.person.ResearcherView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryResult {
    private List<ResearcherView> researchers;
    private Long total;
}
