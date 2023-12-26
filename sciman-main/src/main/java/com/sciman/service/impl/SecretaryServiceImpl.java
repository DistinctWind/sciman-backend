package com.sciman.service.impl;

import com.sciman.dao.SecretaryMapper;
import com.sciman.pojo.Secretary;
import com.sciman.service.SecretaryService;
import com.sciman.vo.person.ResearcherView;
import com.sciman.vo.person.SecretaryView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SecretaryServiceImpl implements SecretaryService {
    private final SecretaryMapper secretaryMapper;

    @Override
    public List<SecretaryView> getAllResearcherView() {
        List<Secretary> secretaries = secretaryMapper.getAllSecretary();
        List<SecretaryView> secretaryViews = new ArrayList<>(secretaries.size());
        for (Secretary secretary : secretaries) {
            secretaryViews.add(new SecretaryView(secretary));
        }
        return secretaryViews;
    }

    @Override
    public SecretaryView getResearcherViewById(Long id) {
        return new SecretaryView(secretaryMapper.getSecretaryById(id));
    }
}
