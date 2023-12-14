package com.sciman.controller;

import com.sciman.dto.login.LoginParam;
import com.sciman.service.LoginService;
import com.sciman.utils.result.Result;
import com.sciman.vo.login.LoginData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;
    @PostMapping("/verify")
    public Result verify(@RequestBody LoginParam loginParam) {
        LoginData loginData = loginService.verify(loginParam);
        if (loginData == null) {
            return Result.fail("登录失败");
        }
        return Result.success(loginData);
    }
}
