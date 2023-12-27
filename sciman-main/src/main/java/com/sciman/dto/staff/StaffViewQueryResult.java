package com.sciman.dto.staff;

import com.sciman.vo.person.StaffView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffViewQueryResult {
    private Long total;
    private List<StaffView> staffs;
}
