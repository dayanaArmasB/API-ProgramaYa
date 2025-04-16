package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogramaya.api.Model.entity.Valoracion;

public interface ValoracionRepository extends JpaRepository<Valoracion, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
