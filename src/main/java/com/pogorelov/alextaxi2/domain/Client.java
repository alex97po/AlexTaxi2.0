package com.pogorelov.alextaxi2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private BigDecimal moneySpent;
    @OneToOne
    private ClientAuth clientAuth;
}