package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Staff;
import com.sciman.vo.person.StaffView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StaffMapper {
    @Select("select * from staff")
    List<Staff> getAllStaff();

    Page<StaffView> getStaffViewFor(
            String nameFilter,
            String laboratoryFilter
    );

    Integer updateStaff(Staff staff);
}
