package com.sciman.service;

import com.sciman.pojo.Laboratory;
import com.sciman.vo.lab.LaboratoryIntroduction;

import java.util.List;

public interface LabService {
    List<Laboratory> listAllLaboratories();
    List<LaboratoryIntroduction> listLaboratoryIntroductionFor(Integer page, Integer count);

    Integer delete(Integer id);
}
