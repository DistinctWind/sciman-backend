package com.sciman.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModifyPasswordParam {
    private String newPassword;
    private Integer id;
}
