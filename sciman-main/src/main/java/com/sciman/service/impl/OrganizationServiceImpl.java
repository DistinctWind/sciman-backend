package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.ContactMapper;
import com.sciman.dao.OrganizationMapper;
import com.sciman.dto.organization.OrganizationQueryParam;
import com.sciman.dto.organization.OrganizationViewQueryResult;
import com.sciman.pojo.Contact;
import com.sciman.pojo.Organization;
import com.sciman.service.OrganizationService;
import com.sciman.vo.project.OrganizationView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrganizationServiceImpl implements OrganizationService {
    private final ContactMapper contactMapper;
    private final OrganizationMapper organizationMapper;

    @Override
    public Contact getPrincipalContactByOrganizationId(Long organizationId) {
        Organization organization = organizationMapper.getOrganizationById(organizationId);
        if (organization == null)
            throw new RuntimeException("Organization not found");
        Long principalContactId = organization.getPrincipalContactId();
        return contactMapper.getContactById(principalContactId);
    }

    @Override
    public OrganizationViewQueryResult getOrganizationViewsOf(OrganizationQueryParam queryParam) {
        log.info("querying organization view of: {}", queryParam);
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<Organization> organizations = organizationMapper.getOrganizationsFor(
                queryParam.getNameFilter()
        );
        List<Organization> resultOrganizations = organizations.getResult();
        List<OrganizationView> resultOrganizationViews = new ArrayList<>();
        for (Organization organization : resultOrganizations) {
            resultOrganizationViews.add(
                    this.getOrganizationViewByOrganizationId(organization.getId())
            );
        }
        OrganizationViewQueryResult result = new OrganizationViewQueryResult();
        result.setTotal(organizations.getTotal());
        result.setOrganizations(resultOrganizationViews);
        return result;
    }

    @Override
    public OrganizationView getOrganizationViewByOrganizationId(Long organizationId) {
        Organization organization = organizationMapper.getOrganizationById(organizationId);
        if (organization == null)
            throw new RuntimeException("Organization not found");
        Long principalContactId = organization.getPrincipalContactId();
        Contact principalContact = contactMapper.getContactById(principalContactId);
        List<Contact> secondaryContacts = organizationMapper.getSecondaryContactsByOrganizationId(organizationId);
        return new OrganizationView(
                organization.getId(),
                organization.getName(),
                organization.getAddress(),
                principalContact,
                secondaryContacts
        );
    }

    @Override
    public List<Contact> getSecondaryContactsByOrganizationId(Long organizationId) {
        Organization organization = organizationMapper.getOrganizationById(organizationId);
        if (organization == null)
            throw new RuntimeException("Organization not found");
        return organizationMapper.getSecondaryContactsByOrganizationId(organizationId);
    }
}
