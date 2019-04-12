package com.pogorelov.alextaxi2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class ClientAuth {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String login;

    @Column
    private String password;

    public ClientAuth(String login,String password){
        this.login = login;
        this.password = password;
    }


}