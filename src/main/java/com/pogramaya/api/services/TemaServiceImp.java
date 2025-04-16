package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Tema;
import com.pogramaya.api.Model.repository.TemaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TemaServiceImp implements TemaService {
private final TemaRepository temaRepository;

    @Override
    public List<Tema> obtenerTodos() {
        return temaRepository.findAll();
    }

    @Override
    public Optional<Tema> obtenerPorId(Long id) {
        return temaRepository.findById(id);
    }

    @Override
    public Tema guardar(Tema tema) {
        return temaRepository.save(tema);
    }

    @Override
    public void eliminar(Long id) {
        temaRepository.deleteById(id);
    }
    
}
