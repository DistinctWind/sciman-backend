package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.AchievementMapper;
import com.sciman.dao.AttendProjectMapper;
import com.sciman.dao.ResearcherMapper;
import com.sciman.dto.researcher.ResearcherListParam;
import com.sciman.dto.researcher.ResearcherQueryParam;
import com.sciman.dto.researcher.ResearcherViewQueryResult;
import com.sciman.pojo.Researcher;
import com.sciman.service.ResearcherService;
import com.sciman.vo.person.ResearcherView;
import com.sciman.vo.project.ProjectAttendanceView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ResearcherServiceImpl implements ResearcherService {
    private final ResearcherMapper researcherMapper;
    private final AttendProjectMapper attendProjectMapper;
    private final AchievementMapper achievementMapper;

    @Override
    public ResearcherViewQueryResult listResearcherViewFor(ResearcherQueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<ResearcherView> result = researcherMapper.listResearcherView(
                queryParam.getNameFilter(),
                queryParam.getLaboratoryNameFilter()
        );
        return new ResearcherViewQueryResult(result.getResult(), result.getTotal());
    }

    @Override
    public ResearcherView getResearcherView(Long id) {
        log.info("querying researcher view with id: {}", id);
        return researcherMapper.getResearcherViewFor(id);
    }

    @Override
    public Researcher getResearcher(Long id) {
        log.info("querying researcher with id: {}", id);
        return researcherMapper.getResearcherId(id);
    }

    @Override
    public boolean deleteResearcher(Long id) {
        log.info("deleting researcher with id: {}", id);
        return researcherMapper.deleteResearcher(id) == 1;
    }

    @Override
    public boolean insertResearcher(Researcher researcher) {
        log.info("inserting researcher: {}", researcher);
        return researcherMapper.insertResearcher(researcher) == 1;
    }

    @Override
    public boolean modifyResearcher(Researcher researcher) {
        log.info("modifying researcher: {}", researcher);
        return researcherMapper.updateResearcher(researcher) == 1;
    }

    @Override
    public List<ResearcherView> listAllResearcherView(ResearcherListParam listParam) {
        listParam.normalize();
        if (listParam.getLaboratoryId() != null) {
            return researcherMapper.listAllResearcherView(listParam.getLaboratoryId());
        } else if (listParam.getAchievementId() != null) {
            Long projectId = achievementMapper.getProjectIdOfAchievementId(listParam.getAchievementId());
            List<ProjectAttendanceView> result = attendProjectMapper.getProjectAttendanceViewOfProjectId(projectId);
            log.info("result: {}", result.toString());
            List<ResearcherView> researcherViews = new ArrayList<>();
            for (ProjectAttendanceView view : result) {
                ResearcherView researcherView = new ResearcherView();
                researcherView.setEmployeeId(Math.toIntExact(view.getResearcherId()));
                researcherView.setName(view.getResearcherName());
                researcherViews.add(researcherView);
            }
            return researcherViews;
        }
        return researcherMapper.listAllResearcherView(null);
    }
}
