package com.sciman.service;

import com.sciman.dto.organization.OrganizationQueryParam;
import com.sciman.dto.organization.OrganizationViewQueryResult;
import com.sciman.pojo.Contact;
import com.sciman.vo.project.OrganizationView;

import java.util.List;

public interface OrganizationService {
    List<OrganizationView> listAllOrganization();
    Contact getPrincipalContactByOrganizationId(Long organizationId);
    List<Contact> getSecondaryContactsByOrganizationId(Long organizationId);
    OrganizationView getOrganizationViewByOrganizationId(Long organizationId);
    OrganizationViewQueryResult getOrganizationViewsOf(OrganizationQueryParam queryParam);
    boolean updatePrimaryContact(Long id, Contact contact);
}
