package com.sciman.dto.login;

import com.sciman.vo.login.LoginRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginParam {
    private String username;
    private String password;
    private LoginRole expectedRole;
}
