package com.sciman.service;

import com.sciman.dto.laboratory.LaboratoryQueryParam;
import com.sciman.dto.laboratory.LaboratorySecretaryModifyParam;
import com.sciman.dto.laboratory.LaboratoryViewQueryResult;
import com.sciman.pojo.Laboratory;
import com.sciman.vo.lab.LaboratoryView;

import java.util.List;

public interface LabService {
    List<Laboratory> listAllLaboratories();
    List<LaboratoryView> listLaboratoryIntroductionFor(Integer page, Integer count);
    boolean delete(Long id);
    LaboratoryViewQueryResult listLaboratoryViewFor(LaboratoryQueryParam queryParam);
    boolean modifyLabSecretary(LaboratorySecretaryModifyParam modifyParam);
    String queryOrientationOfLabId(Long id);
    boolean insertLaboratory(Laboratory laboratory);
}
