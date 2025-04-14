package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogramaya.api.Model.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
}
