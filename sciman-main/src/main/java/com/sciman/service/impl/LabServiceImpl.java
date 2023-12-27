package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.*;
import com.sciman.dto.laboratory.LaboratoryQueryParam;
import com.sciman.dto.laboratory.LaboratorySecretaryModifyParam;
import com.sciman.dto.laboratory.LaboratoryViewQueryResult;
import com.sciman.pojo.Laboratory;
import com.sciman.service.LabService;
import com.sciman.vo.lab.LaboratoryView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LabServiceImpl implements LabService {
    private final LabMapper labMapper;
    private final ServeMapper serveMapper;
    private final StaffMapper staffMapper;
    private final ResearcherMapper researcherMapper;
    private final VenueMapper venueMapper;

    @Override
    public boolean insertLaboratory(Laboratory laboratory) {
        Integer result = labMapper.insert(laboratory);
        serveMapper.insertServePlaceHolderFor(laboratory.getId());
        staffMapper.insertStaffPlaceHolderForLabId(laboratory.getId());
        return result == 1;
    }

    @Override
    public boolean modifyLabSecretary(LaboratorySecretaryModifyParam modifyParam) {
        Integer result = serveMapper.modifyLabSecretary(
                modifyParam.getLaboratoryId(),
                modifyParam.getSecretaryId()
        );
        return result == 1;
    }

    @Override
    public String queryOrientationOfLabId(Long id) {
        return labMapper.queryOrientationOfLabId(id);
    }

    @Override
    public LaboratoryViewQueryResult listLaboratoryViewFor(LaboratoryQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<LaboratoryView> laboratoryViews = labMapper.listLaboratoryViewFor(
                queryParam.getLaboratoryNameFilter()
        );
        return new LaboratoryViewQueryResult(laboratoryViews.getResult(), laboratoryViews.getTotal());
    }

    @Override
    public boolean delete(Long id) {
        serveMapper.deleteServeRelationFor(id);
        staffMapper.deleteStaffByLabId(id);
        venueMapper.deleteVenueByLabId(id);
        researcherMapper.deleteResearcherByLabId(id);
        Integer result = labMapper.delete(id);
        return result == 1;
    }

    @Override
    public List<LaboratoryView> listLaboratoryIntroductionFor(Integer page, Integer count) {
        return labMapper.queryLabIntros(null);
    }

    @Override
    public List<Laboratory> listAllLaboratories() {
        return labMapper.getAllLabs();
    }
}
