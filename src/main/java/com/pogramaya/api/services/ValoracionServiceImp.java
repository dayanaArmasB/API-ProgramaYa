package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Valoracion;
import com.pogramaya.api.Model.repository.ValoracionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ValoracionServiceImp implements ValoracionService {
    
    private final ValoracionRepository valoracionRepository;

    @Override
    public List<Valoracion> obtenerTodas() {
        return valoracionRepository.findAll();
    }

    @Override
    public Optional<Valoracion> obtenerPorId(Long id) {
        return valoracionRepository.findById(id);
    }

    @Override
    public Valoracion guardar(Valoracion valoracion) {
        return valoracionRepository.save(valoracion);
    }

    @Override
    public void eliminar(Long id) {
        valoracionRepository.deleteById(id);
    }
}
