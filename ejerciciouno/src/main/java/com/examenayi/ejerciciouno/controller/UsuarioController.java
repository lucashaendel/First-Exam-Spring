package com.examenayi.ejerciciouno.controller;

import com.examenayi.ejerciciouno.entities.Usuario;
import com.examenayi.ejerciciouno.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model){
        List<Usuario> listaUsuario = usuarioRepository.findAll();

        model.addAttribute("titulo", "LISTADO DE USUARIOS");
        model.addAttribute("usuarios", listaUsuario);
        return "listaUsuarios";
    }
}
