package com.project.STS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.STS.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByUserId(Long userId);
}
