package com.sciman.vo.project;

import com.sciman.pojo.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationView {
    private Long id;
    private String organizationName;
    private String address;
    private Contact principalContact;
    private List<Contact> secondaryContacts;
}
