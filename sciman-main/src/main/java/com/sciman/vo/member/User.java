package com.sciman.vo.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer associatedEmployeeId;
}
