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

import com.pogramaya.api.Model.entity.Profesor;
import com.pogramaya.api.services.ProfesorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/profesor")
@RequiredArgsConstructor
public class ProfesorController {
    private final ProfesorService profesorService;

    @GetMapping
    public ResponseEntity<List<Profesor>> listarProfesores() {
        return ResponseEntity.ok(profesorService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesor> obtenerProfesorPorId(@PathVariable Long id) {
        return ResponseEntity.of(profesorService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<Profesor> crearProfesor(@RequestBody Profesor profesor) {
        return ResponseEntity.ok(profesorService.guardar(profesor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> actualizarProfesor(@PathVariable Long id, @RequestBody Profesor profesor) {
        profesor.setId(id);
        return ResponseEntity.ok(profesorService.guardar(profesor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProfesor(@PathVariable Long id) {
        profesorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
