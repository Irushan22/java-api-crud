package com.javacrudapi.crud.repository;


import com.javacrudapi.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
