package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Inscripcion;
import com.pogramaya.api.Model.repository.InscripcionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InscripcionServiceImp implements InscripcionService {

    private final InscripcionRepository inscripcionRepository;

    @Override
    public List<Inscripcion> obtenerTodas() {
        return inscripcionRepository.findAll();
    }

    @Override
    public Optional<Inscripcion> obtenerPorId(Long id) {
        return inscripcionRepository.findById(id);
    }

    @Override
    public Inscripcion guardar(Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion);
    }

    @Override
    public void eliminar(Long id) {
        inscripcionRepository.deleteById(id);
    }
    
}
