package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Usuario;

public interface UsuarioService {
    List<Usuario> obtenerTodos();
    Optional<Usuario> obtenerPorId(Long id);
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);
}
