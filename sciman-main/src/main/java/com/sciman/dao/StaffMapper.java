package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Staff;
import com.sciman.vo.person.StaffView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StaffMapper {
    @Select("select * from staff")
    List<Staff> getAllStaff();

    @Select("select * from staff where id = #{id}")
    Staff getStaffById(Long id);

    Page<StaffView> getStaffViewFor(
            String nameFilter,
            String laboratoryFilter
    );

    Integer updateStaff(Staff staff);

    @Insert("insert into staff(laboratory_id) value (#{laboratoryId})")
    Integer insertStaffPlaceHolderForLabId(Integer laboratoryId);

    @Delete("delete from staff where laboratory_id = #{labId}")
    Integer deleteStaffByLabId(Long labId);
}
