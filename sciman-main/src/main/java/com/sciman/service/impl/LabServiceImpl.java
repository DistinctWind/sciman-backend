package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.LabMapper;
import com.sciman.dao.ServeMapper;
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

    @Override
    public boolean modifyLabSecretary(LaboratorySecretaryModifyParam modifyParam) {
        Integer result = serveMapper.modifyLabSecretary(
                modifyParam.getLaboratoryId(),
                modifyParam.getSecretaryId()
        );
        return result == 1;
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
    public Integer delete(Integer id) {
        return labMapper.delete(id);
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
