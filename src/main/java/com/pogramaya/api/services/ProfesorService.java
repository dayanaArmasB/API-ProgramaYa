package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Profesor;

public interface ProfesorService {
    List<Profesor> obtenerTodos();
    Optional<Profesor> obtenerPorId(Long id);
    Profesor guardar(Profesor profesor);
    void eliminar(Long id);
}
