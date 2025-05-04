package com.web.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
