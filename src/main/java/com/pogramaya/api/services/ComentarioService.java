package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Comentario;

public interface ComentarioService {
    List<Comentario> obtenerTodos();
    Optional<Comentario> obtenerPorId(Long id);
    Comentario guardar(Comentario comentario);
    void eliminar(Long id);
}
