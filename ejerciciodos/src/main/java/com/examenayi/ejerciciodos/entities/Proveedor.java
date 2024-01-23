package com.examenayi.ejerciciodos.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "proveedores")
public class Proveedor {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor;
    private String nombreProveedor;
    private String telefonoProveedor;
    private String direccionProveedor;
    private String emailProveedor;
    private String webProveedor;
    private int estadoProveedor;

}
