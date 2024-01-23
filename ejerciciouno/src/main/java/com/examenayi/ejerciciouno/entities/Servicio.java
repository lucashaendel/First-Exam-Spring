package com.examenayi.ejerciciouno.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity

@Table(name = "servicios")
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    private int codigoEanServicio;
    private String nombreServicio;
    private String descripcionServicio;
    private Double precioServicio;
    private int duracionServicio;
}
