package com.project.STS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.STS.entity.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Long> {
    Optional<StudentDetails> findByUserId(Long userId);
}
