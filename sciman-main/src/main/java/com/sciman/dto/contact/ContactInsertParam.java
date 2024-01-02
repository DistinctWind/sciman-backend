package com.sciman.dto.contact;

import com.sciman.pojo.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInsertParam {
    private Contact contact;
    private Long organizationId;
}
