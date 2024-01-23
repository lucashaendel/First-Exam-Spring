package com.examenayi.ejerciciodos.controller;

import com.examenayi.ejerciciodos.entities.Usuario;
import com.examenayi.ejerciciodos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String showLoginForm() {
        return "index";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute Usuario usuario, Model model) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByNombreUsuarioAndPasswordUsuario(usuario.getNombreUsuario(), usuario.getPasswordUsuario());
        if (usuarioOptional.isPresent()) {
            return "redirect:/proveedores";
        } else {
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
            return "index";
        }
    }
}