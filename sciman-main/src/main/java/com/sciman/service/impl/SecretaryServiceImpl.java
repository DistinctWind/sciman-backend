package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.SecretaryMapper;
import com.sciman.dto.secretary.QueryParam;
import com.sciman.dto.secretary.SecretaryViewQueryResult;
import com.sciman.pojo.Secretary;
import com.sciman.service.SecretaryService;
import com.sciman.vo.person.SecretaryView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
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

    @Override
    public SecretaryViewQueryResult getResearcherViewFor(QueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<SecretaryView> secretaryViews = secretaryMapper.getSecretaryFor(
                queryParam.getNameFilter()
        );
        return new SecretaryViewQueryResult(secretaryViews.getResult(), secretaryViews.getTotal());
    }
}
