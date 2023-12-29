package com.sciman.dao;

import com.sciman.pojo.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrganizationMapper {
    @Select("select * from organization where id = #{id}")
    Organization getOrganizationById(Long id);
}
