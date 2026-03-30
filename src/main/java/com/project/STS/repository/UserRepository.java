package com.project.STS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.STS.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
