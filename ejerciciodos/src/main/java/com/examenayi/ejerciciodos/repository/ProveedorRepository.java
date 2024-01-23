package com.examenayi.ejerciciodos.repository;

import com.examenayi.ejerciciodos.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository  extends JpaRepository<Proveedor, Long> {
}
