package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import com.pogramaya.api.Model.entity.Inscripcion;

public interface InscripcionService {
    List<Inscripcion> obtenerTodas();
    Optional<Inscripcion> obtenerPorId(Long id);
    Inscripcion guardar(Inscripcion inscripcion);
    void eliminar(Long id);
}
