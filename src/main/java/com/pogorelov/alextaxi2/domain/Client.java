package com.pogorelov.alextaxi2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Client implements UserDetails {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private BigDecimal moneySpent;
    @OneToOne
    private ClientAuth clientAuth;
    @ElementCollection (targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable (name = "client_role", joinColumns = @JoinColumn(name = "client_id"))
    @Enumerated (EnumType.STRING)
    private Set<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}