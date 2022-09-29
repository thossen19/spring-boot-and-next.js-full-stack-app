package com.dev.thossen.usermms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.thossen.usermms.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

