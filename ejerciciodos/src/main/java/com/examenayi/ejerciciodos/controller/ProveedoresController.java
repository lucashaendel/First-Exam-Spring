package com.examenayi.ejerciciodos.controller;
import com.examenayi.ejerciciodos.entities.Proveedor;
import com.examenayi.ejerciciodos.repository.ProveedorRepository;
import com.examenayi.ejerciciodos.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ProveedoresController {
    private static final Map<Integer, String> estadosProveedor = new HashMap<>();
    static {
        estadosProveedor.put(1, "Activo");
        estadosProveedor.put(2, "Inactivo");
        estadosProveedor.put(3, "Dado de baja");
    }
    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping("/proveedores")
    public String listarProveedores(Model model) {
        List<Proveedor> proveedores = proveedorRepository.findAll();
        List<String> estadosString = proveedores.stream()
                .map(proveedor -> estadosProveedor.get(proveedor.getEstadoProveedor()))
                .collect(Collectors.toList());
        model.addAttribute("titulo", "LISTADO DE PROVEEDORES");
        model.addAttribute("proveedores", proveedores);
        model.addAttribute("estadosString", estadosString);
        return "listaProveedores";
    }

    @GetMapping("/nuevoProveedor")
    public String formularioNuevoProveedor(Model model) {
        model.addAttribute("proveedor", new Proveedor());
        return "formularioProveedores";
    }

    @PostMapping("/guardarProveedor")
    public String guardarProveedor(@ModelAttribute Proveedor proveedor){
        proveedorRepository.save(proveedor);
        return "redirect:/nuevoProveedor";
    }

    @GetMapping("/eliminarProveedor/{id}")
    public String eliminarProveedor(@PathVariable Long id) {
        proveedorRepository.deleteById(id);
        return "redirect:/proveedores";
    }
}
