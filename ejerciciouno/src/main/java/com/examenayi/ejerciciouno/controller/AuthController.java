package com.examenayi.ejerciciouno.controller;

import com.examenayi.ejerciciouno.entities.Usuario;
import com.examenayi.ejerciciouno.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/seleccion")
    public String showLoginForm() {
        return "seleccion";
    }

    @PostMapping("/seleccion")
    public String login(@ModelAttribute Usuario usuario, Model model) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByNombreUsuarioAndPasswordUsuario(usuario.getNombreUsuario(), usuario.getPasswordUsuario());

        if (usuarioOptional.isPresent()) {
            return "seleccion";
        } else {
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
            return "index";
        }
    }
}