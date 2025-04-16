package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogramaya.api.Model.entity.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
    
}
