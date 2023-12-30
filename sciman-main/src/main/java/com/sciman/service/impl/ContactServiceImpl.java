package com.sciman.service.impl;

import com.sciman.dao.ContactMapper;
import com.sciman.pojo.Contact;
import com.sciman.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactMapper contactMapper;
    @Override
    public Contact getContactById(Long id) {
        return contactMapper.getContactById(id);
    }
}
