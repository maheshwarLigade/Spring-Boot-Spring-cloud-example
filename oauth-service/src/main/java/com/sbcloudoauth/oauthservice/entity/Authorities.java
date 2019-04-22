package com.sbcloudoauth.oauthservice.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Authorities implements GrantedAuthority {
    ROLE_USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
