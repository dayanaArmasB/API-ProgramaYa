package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogramaya.api.Model.entity.Inscripcion;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
