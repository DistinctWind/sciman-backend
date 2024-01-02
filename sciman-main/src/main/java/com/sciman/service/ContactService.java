package com.sciman.service;

import com.sciman.dto.contact.ContactQueryParam;
import com.sciman.dto.contact.ContactQueryResult;
import com.sciman.pojo.Contact;

public interface ContactService {
    Contact getContactById(Long id);

    ContactQueryResult getContactList(ContactQueryParam queryParam);
}
