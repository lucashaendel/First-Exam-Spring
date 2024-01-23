package com.examenayi.ejerciciodos.controller;

import com.examenayi.ejerciciodos.entities.Usuario;
import com.examenayi.ejerciciodos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/index")
    public String listarUsuarios(Model model){
        List<Usuario> listaUsuario = usuarioRepository.findAll();

        model.addAttribute("titulo", "LISTADO DE USUARIOS");
//        model.addAttribute("usuarios", listaUsuario);
        return "index";
    }
}
