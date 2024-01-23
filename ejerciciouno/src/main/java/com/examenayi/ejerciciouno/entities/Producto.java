package com.examenayi.ejerciciouno.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private int codigoEanProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private Double precioProducto;
    private int stockProducto;

    public Producto() {
    }

    public Producto(int idProducto, int codigoEanProducto, String nombreProducto, String descripcionProducto, Double precioProducto, int stockProducto) {
        this.idProducto = idProducto;
        this.codigoEanProducto = codigoEanProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCodigoEanProducto() {
        return codigoEanProducto;
    }

    public void setCodigoEanProducto(int codigoEanProducto) {
        this.codigoEanProducto = codigoEanProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }
}
