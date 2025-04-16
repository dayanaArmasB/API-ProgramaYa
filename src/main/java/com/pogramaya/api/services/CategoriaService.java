package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Categoria;

public interface CategoriaService {
    List<Categoria> obtenerTodas();
    Optional<Categoria> obtenerPorId(Long id);
    Categoria guardar(Categoria categoria);
    void eliminar(Long id);
}
