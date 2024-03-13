package com.picpaysimplificado.domain.user;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name="users")
@Table(name="users")
@Getter    //  lombot
@Setter
@AllArgsConstructor   // gera constructor q recebe os parâmetros da classe
@EqualsAndHashCode(of="id") //chave primária da tabela
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera id de forma incremental
    private Long id;
    private String fisrtName;
    private String lastName;
    @Column(unique=true)
    private String document;
    @Column(unique=true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING) // userType representa um dos valores criados
    private UserType userType;
}
