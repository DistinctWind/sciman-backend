package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.SecretaryMapper;
import com.sciman.dao.ServeMapper;
import com.sciman.dto.secretary.SecretaryQueryParam;
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
    private final ServeMapper serveMapper;

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
    public boolean deleteSecretaryById(Long id) {
        log.info("delete secretary by id: {}", id);
        return secretaryMapper.deleteSecretaryById(id) == 1;
    }

    @Override
    public Long getSecretaryIdByLabId(Long labId) {
        return serveMapper.getLabSecretaryId(labId);
    }

    @Override
    public boolean insertSecretary(Secretary secretary) {
        log.info("insert secretary: {}", secretary);
        return secretaryMapper.insertSecretary(secretary) == 1;
    }

    @Override
    public boolean modifySecretary(Secretary secretary) {
        log.info("modify secretary: {}", secretary);
        return secretaryMapper.updateSecretary(secretary) == 1;
    }

    @Override
    public SecretaryViewQueryResult getSecretaryViewFor(SecretaryQueryParam queryParam) {
        log.info(queryParam.toString());
        queryParam.normalize();
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<SecretaryView> secretaryViews = secretaryMapper.getSecretaryFor(
                queryParam.getNameFilter()
        );
        return new SecretaryViewQueryResult(secretaryViews.getResult(), secretaryViews.getTotal());
    }
}
