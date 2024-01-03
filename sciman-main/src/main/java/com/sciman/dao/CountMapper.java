package com.sciman.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CountMapper {
    @Select("select count(*) from laboratory")
    Integer getLaboratoryCount();

    @Select("select count(*) from secretary")
    Integer getSecretaryCount();

    @Select("select count(*) from researcher")
    Integer getResearcherCount();

    @Select("select count(*) from venue")
    Integer getVenueCount();

    @Select("select count(*) from organization")
    Integer getOrganizationCount();

    @Select("select count(*) from project")
    Integer getProjectCount();

    @Select("select count(*) from contact")
    Integer getContactCount();

    @Select("select count(*) from achievement")
    Integer getAchievementCount();
}
