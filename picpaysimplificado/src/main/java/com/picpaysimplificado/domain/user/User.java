package com.picpaysimplificado.domain.user;


import com.picpaysimplificado.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name="users")
@Table(name="users")
@Getter    //  lombot
@Setter
@AllArgsConstructor   // gera constructor q recebe os parâmetros da classe
@NoArgsConstructor
@EqualsAndHashCode(of="id") //chave primária da tabela
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera id de forma incremental
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique=true)
    private String document;
    @Column(unique=true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING) // userType representa um dos valores criados
    private UserType userType;
    public User(UserDTO data){
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.balance = data.balance();
        this.userType = data.userType();
        this.password = data.password();
        this.document = data.document();
        this.email = data.email();
    }
}
