package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Modulo;

public interface ModuloService {
    List<Modulo> obtenerTodos();
    Optional<Modulo> obtenerPorId(Long id);
    Modulo guardar(Modulo modulo);
    void eliminar(Long id);
}
