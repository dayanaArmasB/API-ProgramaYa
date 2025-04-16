package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Categoria;
import com.pogramaya.api.Model.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaServiceImp implements CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> obtenerPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
