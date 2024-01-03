package com.sciman.dao;

import com.github.pagehelper.Page;
import com.sciman.pojo.Contact;
import com.sciman.pojo.Organization;
import com.sciman.vo.project.OrganizationView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrganizationMapper {
    @Select("select * from organization where id = #{id}")
    Organization getOrganizationById(Long id);

    List<Contact> getSecondaryContactsByOrganizationId(Long organizationId);

    Page<Contact> getSecondaryContactsByOrganizationIdParamed(Long organizationId);

    Page<Organization> getOrganizationsFor(
            String nameFilter
    );

    @Select("select principal_contact_id from organization where id = #{organizationId}")
    Long getPrincipalContactIdByOrganizationId(Long organizationId);

    List<OrganizationView> getBasicOrganizationViews();
}
