package com.sciman.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    private Long id;
    private String name;
    private String address;
    private Long principalContactId;
}
