package com.sciman.dao;

import com.sciman.vo.project.ProjectAttendanceView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttendProjectMapper {
    List<ProjectAttendanceView> getProjectAttendanceViewOfProjectId(Long projectId);
}
