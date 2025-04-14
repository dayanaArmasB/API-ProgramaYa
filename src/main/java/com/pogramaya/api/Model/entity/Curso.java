package com.pogramaya.api.Model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "duracion_total")
    private int duracionTotal; // en horas

    @Column(name = "ranking")
    private double ranking;

    @Column(name = "es_gratis")
    private boolean esGratis;

    @Column(name = "nivel_dificultad")
    private String nivelDificultad;

    @Column(name = "numero_estudiantes")
    private int numeroEstudiantes;

    @Column(name = "fecha_publicacion")
    private LocalDate fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "profesor_id")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria; 
}
