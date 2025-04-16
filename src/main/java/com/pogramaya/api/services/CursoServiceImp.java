package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Curso;
import com.pogramaya.api.Model.repository.CursoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CursoServiceImp implements CursoService {
    
    private final CursoRepository cursoRepository;

    @Override
    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> obtenerPorId(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public void eliminar(Long id) {
        cursoRepository.deleteById(id);
    }
}
