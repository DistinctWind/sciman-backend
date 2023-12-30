package com.sciman.service;

import com.sciman.vo.project.OrganizationView;

import java.util.List;

public interface CoworkerOrganizationService {
    List<OrganizationView> getCoworkerOrganizationViewsOfProjectId(Long projectId);
}
