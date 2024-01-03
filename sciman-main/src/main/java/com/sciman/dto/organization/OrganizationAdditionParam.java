package com.sciman.dto.organization;

import com.sciman.pojo.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationAdditionParam {
    private String organizationName;
    private String address;
    private Contact principalContact;
}
