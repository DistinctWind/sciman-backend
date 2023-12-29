package com.sciman.service;

import com.sciman.pojo.Contact;

import java.util.List;

public interface OrganizationService {
    Contact getPrincipalContactByOrganizationId(Long organizationId);
    List<Contact> getSecondaryContactsByOrganizationId(Long organizationId);
}
