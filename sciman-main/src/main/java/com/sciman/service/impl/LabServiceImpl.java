package com.sciman.service.impl;

import com.sciman.dao.LabMapper;
import com.sciman.pojo.Laboratory;
import com.sciman.service.LabService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LabServiceImpl implements LabService {
    private final LabMapper labMapper;

    @Override
    public List<Laboratory> listAllLaboratories() {
        return labMapper.getAllLabs();
    }
}
