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
    public List<SecretaryView> getAllSecretaryView() {
        List<Secretary> secretaries = secretaryMapper.getAllSecretary();
        List<SecretaryView> secretaryViews = new ArrayList<>(secretaries.size());
        for (Secretary secretary : secretaries) {
            secretaryViews.add(new SecretaryView(secretary));
        }
        return secretaryViews;
    }

    @Override
    public Secretary getSecretaryById(Long id) {
        return secretaryMapper.getSecretaryById(id);
    }

    @Override
    public boolean modifySecretary(Secretary secretary) {
        log.info("modify secretary: {}", secretary);
        return secretaryMapper.updateSecretary(secretary) == 1;
    }

    @Override
    public SecretaryViewQueryResult getSecretaryViewFor(QueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<SecretaryView> secretaryViews = secretaryMapper.getSecretaryFor(
                queryParam.getNameFilter()
        );
        return new SecretaryViewQueryResult(secretaryViews.getResult(), secretaryViews.getTotal());
    }
}
