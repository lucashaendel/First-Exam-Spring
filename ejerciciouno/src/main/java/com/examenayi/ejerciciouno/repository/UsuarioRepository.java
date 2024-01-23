package com.examenayi.ejerciciouno.repository;

import com.examenayi.ejerciciouno.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNombreUsuarioAndPasswordUsuario(String nombreUsuario, String passwordUsuario);
}
