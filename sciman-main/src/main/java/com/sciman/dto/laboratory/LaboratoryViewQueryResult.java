package com.sciman.dto.laboratory;

import com.sciman.vo.lab.LaboratoryView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaboratoryViewQueryResult {
    private List<LaboratoryView> laboratory;
    private Long total;
}
