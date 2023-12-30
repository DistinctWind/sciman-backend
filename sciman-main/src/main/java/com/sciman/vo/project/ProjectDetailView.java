package com.sciman.vo.project;

import com.sciman.vo.person.ResearcherView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDetailView {
    private ProjectView project;
    private List<ProjectAttendanceView> projectAttendances;
    private List<SubprojectView> subprojects;
    private OrganizationView clientOrganization;
    private List<OrganizationView> coworkerOrganizations;
    private ResearcherView mainResearcher;
}
