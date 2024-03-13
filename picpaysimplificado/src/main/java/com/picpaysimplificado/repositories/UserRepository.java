package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

// pode retornar um usuário cadastrado ou não
    Optional<User> findUserByDocument(String document);
    //jpa monta a tabela
    Optional<User> findUserById(Long id);



}
