package com.sciman.service.impl;

import com.sciman.dao.ContactMapper;
import com.sciman.dao.SecondaryContactMapper;
import com.sciman.dao.CoworkerOrganizationMapper;
import com.sciman.dao.OrganizationMapper;
import com.sciman.service.CoworkerOrganizationService;
import com.sciman.vo.project.OrganizationView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoworkerOrganizationServiceImpl implements CoworkerOrganizationService {
    private final CoworkerOrganizationMapper coworkerOrganizationMapper;
    private final ContactMapper contactMapper;
    private final OrganizationMapper organizationMapper;

    @Override
    public List<OrganizationView> getCoworkerOrganizationViewsOfProjectId(Long projectId) {
        List<OrganizationView> organizationViews =
                coworkerOrganizationMapper.getCoworkerOrganizationViewsOfProjectId(projectId);
        for (OrganizationView organizationView : organizationViews) {
            Long organizationId = organizationView.getId();
            organizationView.setPrincipalContact(contactMapper.getContactById(organizationId));
            organizationView.setSecondaryContacts(organizationMapper.getSecondaryContactsByOrganizationId(organizationId));
        }
        return organizationViews;
    }
}
