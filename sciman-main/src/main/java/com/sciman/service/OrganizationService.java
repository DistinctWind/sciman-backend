package com.sciman.service;

import com.sciman.pojo.Contact;
import com.sciman.vo.project.OrganizationView;

import java.util.List;

public interface OrganizationService {
    Contact getPrincipalContactByOrganizationId(Long organizationId);
    List<Contact> getSecondaryContactsByOrganizationId(Long organizationId);
    OrganizationView getOrganizationViewByOrganizationId(Long organizationId);
}
