package com.sciman.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sciman.dao.ContactMapper;
import com.sciman.dao.OrganizationMapper;
import com.sciman.dto.contact.ContactQueryParam;
import com.sciman.dto.contact.ContactQueryResult;
import com.sciman.pojo.Contact;
import com.sciman.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactMapper contactMapper;
    private final OrganizationMapper organizationMapper;

    @Override
    public boolean deleteContact(Long id) {
        return contactMapper.deleteContact(id) == 1;
    }

    @Override
    public boolean updateContact(Contact contact) {
        return contactMapper.updateContact(contact) == 1;
    }

    @Override
    public ContactQueryResult getContactList(ContactQueryParam queryParam) {
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<Contact> contactList = organizationMapper.getSecondaryContactsByOrganizationIdParamed(
                queryParam.getOrganizationId());
        return new ContactQueryResult(contactList.getResult(), contactList.getTotal());
    }

    @Override
    public Contact getContactById(Long id) {
        return contactMapper.getContactById(id);
    }
}
