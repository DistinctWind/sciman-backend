package com.sciman.service.impl;

import com.sciman.dao.LoginMapper;
import com.sciman.dto.login.LoginParam;
import com.sciman.service.LoginService;
import com.sciman.vo.login.LoginData;
import com.sciman.vo.login.LoginRole;
import com.sciman.vo.member.member.Administrator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final LoginMapper loginMapper;
    @Override
    public LoginData verify(LoginParam loginParam) {
        String username = loginParam.getUsername();
        String password = loginParam.getPassword();
        LoginRole expectedRole = loginParam.getExpectedRole();
        if (expectedRole.equals(LoginRole.ADMIN)) {
            Administrator administrator = loginMapper.loginAsAdministrator(username, password);
            if (administrator == null) {
                return null;
            }
            return new LoginData(administrator.getId());
        }
        return null;
    }
}
