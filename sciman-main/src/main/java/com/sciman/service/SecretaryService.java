package com.sciman.service;

import com.sciman.vo.person.ResearcherView;
import com.sciman.vo.person.SecretaryView;

import java.util.List;

public interface SecretaryService {
    List<SecretaryView> getAllResearcherView();
    SecretaryView getResearcherViewById(Long id);
}
