package com.sciman.vo.member.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Administrator {
    private Integer id;
    private String username;
    private String password;
}
