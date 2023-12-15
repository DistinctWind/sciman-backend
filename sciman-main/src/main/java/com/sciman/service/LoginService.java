package com.sciman.service;

import com.sciman.dto.login.LoginParam;
import com.sciman.dto.login.ModifyPasswordParam;
import com.sciman.vo.login.LoginData;
import org.springframework.stereotype.Service;

public interface LoginService {
    LoginData verify(LoginParam loginParam);
    boolean modifyPassword(ModifyPasswordParam modifyPasswordParam);
}
