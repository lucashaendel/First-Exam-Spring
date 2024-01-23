package com.examenayi.ejerciciouno.controller;

import com.examenayi.ejerciciouno.entities.Producto;
import com.examenayi.ejerciciouno.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/productos")
    public String listarProductos(Model model){
        List<Producto> listaProductos = productoRepository.findAll();
        model.addAttribute("titulo","Listado de Productos");
        model.addAttribute("productos", listaProductos);
        return "listaProductos";
    }


    @GetMapping("/nuevoProducto")
    public String mostrarFormularioNuevoProducto(Model model) {
        model.addAttribute("producto", new Producto());
        return "formularioProducto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@ModelAttribute Producto producto){
        productoRepository.save(producto);
        return "redirect:/nuevoProducto";
    }

    @GetMapping("/eliminarProducto/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoRepository.deleteById(id);
        return "redirect:/productos";
    }
}
