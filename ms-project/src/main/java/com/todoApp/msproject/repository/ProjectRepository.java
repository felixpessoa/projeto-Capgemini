package com.todoApp.msproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoApp.msproject.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
