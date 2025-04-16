package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pogramaya.api.Model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

    

    
}
