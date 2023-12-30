package com.sciman.dao;

import com.sciman.vo.project.OrganizationView;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CoworkerOrganizationMapper {
    List<OrganizationView> getCoworkerOrganizationViewsOfProjectId(Long projectId);
}
