package com.pogorelov.alextaxi2.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    CLIENT;

    @Override
    public String getAuthority() {
        return name();
    }
}
