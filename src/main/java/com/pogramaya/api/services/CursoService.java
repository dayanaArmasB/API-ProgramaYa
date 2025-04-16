package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Curso;

public interface CursoService {
    List<Curso> obtenerTodos();
    Optional<Curso> obtenerPorId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
    

}
