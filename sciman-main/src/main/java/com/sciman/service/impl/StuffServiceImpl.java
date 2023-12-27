package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.StaffMapper;
import com.sciman.dto.staff.StaffQueryParam;
import com.sciman.dto.staff.StaffViewQueryResult;
import com.sciman.pojo.Staff;
import com.sciman.service.StuffService;
import com.sciman.vo.person.StaffView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StuffServiceImpl implements StuffService {
    private final StaffMapper staffMapper;

    @Override
    public List<Staff> listAll() {
        return staffMapper.getAllStaff();
    }

    @Override
    public Staff getById(Long id) {
        return null;
    }

    @Override
    public StaffViewQueryResult getStaffViewFor(StaffQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<StaffView> staffPage = staffMapper.getStaffViewFor(
                queryParam.getNameFilter(),
                queryParam.getLaboratoryFilter()
        );
        return new StaffViewQueryResult(staffPage.getTotal(), staffPage.getResult());
    }
}
