package com.sciman.service;

import com.sciman.dto.staff.StaffQueryParam;
import com.sciman.dto.staff.StaffViewQueryResult;
import com.sciman.pojo.Staff;

import java.util.List;

public interface StuffService {
    List<Staff> listAll();
    Staff getById(Long id);
    StaffViewQueryResult getStaffViewFor(StaffQueryParam queryParam);

    boolean modifyStaff(Staff staff);
}
