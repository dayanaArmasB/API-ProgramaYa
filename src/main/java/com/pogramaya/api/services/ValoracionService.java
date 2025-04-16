package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Valoracion;

public interface ValoracionService {
    List<Valoracion> obtenerTodas();
    Optional<Valoracion> obtenerPorId(Long id);
    Valoracion guardar(Valoracion valoracion);
    void eliminar(Long id);
}
