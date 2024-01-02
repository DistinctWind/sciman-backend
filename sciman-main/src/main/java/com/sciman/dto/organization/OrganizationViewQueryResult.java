package com.sciman.dto.organization;

import com.sciman.vo.project.OrganizationView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationViewQueryResult {
    private Long total;
    private List<OrganizationView> organizations;
}
