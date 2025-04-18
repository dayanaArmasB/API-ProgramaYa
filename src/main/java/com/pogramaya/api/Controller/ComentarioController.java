package com.pogramaya.api.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pogramaya.api.Model.entity.Comentario;
import com.pogramaya.api.services.ComentarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/comentario")
@RequiredArgsConstructor
public class ComentarioController {
    private final ComentarioService comentarioService;

    @GetMapping
    public ResponseEntity<List<Comentario>> listarComentarios() {
        return ResponseEntity.ok(comentarioService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comentario> obtenerComentarioPorId(@PathVariable Long id) {
        return ResponseEntity.of(comentarioService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<Comentario> crearComentario(@RequestBody Comentario comentario) {
        return ResponseEntity.ok(comentarioService.guardar(comentario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comentario> actualizarComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        comentario.setId(id);
        return ResponseEntity.ok(comentarioService.guardar(comentario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarComentario(@PathVariable Long id) {
        comentarioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
