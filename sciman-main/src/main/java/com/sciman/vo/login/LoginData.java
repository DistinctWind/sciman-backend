package com.sciman.vo.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginData {
    private Integer id;
    private LoginRole role;
}
