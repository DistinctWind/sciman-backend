package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.LabMapper;
import com.sciman.dto.laboratory.LaboratoryQueryParam;
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

    @Override
    public LaboratoryViewQueryResult listLaboratoryViewFor(LaboratoryQueryParam queryParam) {
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<LaboratoryView> laboratoryViews = labMapper.listLaboratoryViewFor(null);
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
