package com.sciman.dto.contact;

import com.sciman.pojo.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactQueryResult {
    private List<Contact> contact;
    private Long total;
}
