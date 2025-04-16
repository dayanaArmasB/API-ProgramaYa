package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Tema;

public interface TemaService {
    List<Tema> obtenerTodos();
    Optional<Tema> obtenerPorId(Long id);
    Tema guardar(Tema tema);
    void eliminar(Long id);
}
