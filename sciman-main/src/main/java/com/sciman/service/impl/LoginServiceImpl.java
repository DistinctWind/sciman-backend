package com.sciman.service.impl;

import com.sciman.dao.LoginMapper;
import com.sciman.dto.login.LoginParam;
import com.sciman.dto.login.ModifyPasswordParam;
import com.sciman.service.LoginService;
import com.sciman.vo.login.LoginData;
import com.sciman.vo.login.LoginRole;
import com.sciman.pojo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final LoginMapper loginMapper;

    @Override
    public boolean modifyPassword(ModifyPasswordParam modifyPasswordParam) {
        String newPassword = modifyPasswordParam.getNewPassword();
        Integer id = modifyPasswordParam.getId();
        Integer affectedRows = loginMapper.updatePassword(id, newPassword);
        return affectedRows > 0;
    }

    @Override
    public LoginData verify(LoginParam loginParam) {
        String username = loginParam.getUsername();
        String password = loginParam.getPassword();
        User user = loginMapper.login(username, password);
        if (user == null) {
            return null;
        }
        if (user.getAssociatedEmployeeId() == null) {
            return new LoginData(user.getId(), LoginRole.ADMIN);
        } else {
            return new LoginData(user.getId(), LoginRole.USER);
        }
    }
}
