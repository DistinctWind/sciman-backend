package com.sciman.vo.login;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LoginRole {
    ADMIN;

    @JsonCreator
    public static LoginRole fromString(String value) {
        for (LoginRole role: LoginRole.values()) {
            if (role.toString().equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("Unknown enum value: " + value);
    }

    @JsonValue
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
