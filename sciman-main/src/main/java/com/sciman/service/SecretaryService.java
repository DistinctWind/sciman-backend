package com.sciman.service;

import com.sciman.dto.secretary.QueryParam;
import com.sciman.dto.secretary.SecretaryViewQueryResult;
import com.sciman.pojo.Secretary;
import com.sciman.vo.person.SecretaryView;

import java.util.List;

public interface SecretaryService {
    List<SecretaryView> getAllSecretaryView();
    Secretary getSecretaryById(Long id);
    SecretaryViewQueryResult getSecretaryViewFor(QueryParam queryParam);
    boolean modifySecretary(Secretary secretary);
    boolean deleteSecretaryById(Long id);
}
