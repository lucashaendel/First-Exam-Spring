package com.examenayi.ejerciciouno.repository;

import com.examenayi.ejerciciouno.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
