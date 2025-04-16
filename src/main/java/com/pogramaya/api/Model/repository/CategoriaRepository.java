package com.pogramaya.api.Model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pogramaya.api.Model.entity.Categoria;
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
