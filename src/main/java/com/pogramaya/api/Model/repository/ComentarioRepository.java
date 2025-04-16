package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogramaya.api.Model.entity.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    
}
