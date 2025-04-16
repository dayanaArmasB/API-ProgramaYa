package com.pogramaya.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pogramaya.api.Model.entity.Comentario;
import com.pogramaya.api.Model.repository.ComentarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComentarioServiceImp implements ComentarioService {
    private final ComentarioRepository comentarioRepository;
    
    @Override
    public List<Comentario> obtenerTodos() {
    return comentarioRepository.findAll();
    }
         
     @Override
     public Optional<Comentario> obtenerPorId(Long id) {
         return comentarioRepository.findById(id);
     }
     
     @Override
     public Comentario guardar(Comentario comentario) {
         return comentarioRepository.save(comentario);
     }
     
     @Override
     public void eliminar(Long id) {
         comentarioRepository.deleteById(id);
    }
    
}
