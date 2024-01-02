package com.sciman.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecondaryContactMapper {
    @Insert("insert into organization_secondary_contact (contact_id, organization_id) values (#{contactId}, #{organizationId})")
    Integer addSecondaryContact(Long contactId, Long organizationId);
}