package com.project.STS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.STS.entity.TestResult;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {
    List<TestResult> findByUserId(Long userId);
}
