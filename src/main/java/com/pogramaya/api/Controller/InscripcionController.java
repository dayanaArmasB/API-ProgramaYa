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

import com.pogramaya.api.Model.entity.Inscripcion;
import com.pogramaya.api.services.InscripcionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/inscripcion")
@RequiredArgsConstructor
public class InscripcionController {
    private final InscripcionService inscripcionService;

    @GetMapping
    public ResponseEntity<List<Inscripcion>> listarInscripciones() {
        return ResponseEntity.ok(inscripcionService.obtenerTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inscripcion> obtenerInscripcionPorId(@PathVariable Long id) {
        return ResponseEntity.of(inscripcionService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<Inscripcion> crearInscripcion(@RequestBody Inscripcion inscripcion) {
        return ResponseEntity.ok(inscripcionService.guardar(inscripcion));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inscripcion> actualizarInscripcion(@PathVariable Long id, @RequestBody Inscripcion inscripcion) {
        inscripcion.setId(id);
        return ResponseEntity.ok(inscripcionService.guardar(inscripcion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarInscripcion(@PathVariable Long id) {
        inscripcionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
