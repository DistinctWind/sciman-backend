package com.sciman.dao;

import com.sciman.pojo.Contact;
import com.sciman.pojo.Organization;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrganizationMapper {
    @Select("select * from organization where id = #{id}")
    Organization getOrganizationById(Long id);

    List<Contact> getSecondaryContactsByOrganizationId(Long organizationId);
}