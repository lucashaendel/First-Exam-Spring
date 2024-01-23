package com.examenayi.ejerciciouno.controller;

import com.examenayi.ejerciciouno.entities.Producto;
import com.examenayi.ejerciciouno.entities.Servicio;
import com.examenayi.ejerciciouno.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ServicioController {

    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping("/servicios")
    public String listarServicios(Model model){
        List<Servicio> listaServicios = servicioRepository.findAll();
        model.addAttribute("titulo", "LISTA DE SERVICIOS");
        model.addAttribute("servicios", listaServicios);
        return "listaServicios";
    }

    @GetMapping("/nuevoServicio")
    public String mostrarFormularioNuevoProducto(Model model) {
        model.addAttribute("servicio", new Servicio());
        return "formularioServicio";
    }

    @PostMapping("/guardarServicio")
    public String guardarProducto(@ModelAttribute Servicio servicio){
        servicioRepository.save(servicio);
        return "redirect:/nuevoServicio";
    }

    @GetMapping("/eliminarServicio/{id}")
    public String eliminarServicio(@PathVariable Long id) {
        servicioRepository.deleteById(id);
        return "redirect:/servicios";
    }
}
