package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Profesor;
import com.pogramaya.api.Model.repository.ProfesorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfesorServiceImp implements ProfesorService {
        private final ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> obtenerTodos() {
        return profesorRepository.findAll();
    }

    @Override
    public Optional<Profesor> obtenerPorId(Long id) {
        return profesorRepository.findById(id);
    }

    @Override
    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void eliminar(Long id) {
        profesorRepository.deleteById(id);
    }
}
