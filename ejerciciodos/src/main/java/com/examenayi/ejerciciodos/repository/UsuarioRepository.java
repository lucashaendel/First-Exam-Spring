package com.examenayi.ejerciciodos.repository;

import com.examenayi.ejerciciodos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNombreUsuarioAndPasswordUsuario(String nombreUsuario, String passwordUsuario);
}
