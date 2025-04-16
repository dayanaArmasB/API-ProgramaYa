package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Modulo;
import com.pogramaya.api.Model.repository.ModuloRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModuloServiceImp implements ModuloService {
    private final ModuloRepository moduloRepository;

    @Override
    public List<Modulo> obtenerTodos() {
        return moduloRepository.findAll();
    }

    @Override
    public Optional<Modulo> obtenerPorId(Long id) {
        return moduloRepository.findById(id);
    }

    @Override
    public Modulo guardar(Modulo modulo) {
        return moduloRepository.save(modulo);
    }

    @Override
    public void eliminar(Long id) {
        moduloRepository.deleteById(id);
    }
}
