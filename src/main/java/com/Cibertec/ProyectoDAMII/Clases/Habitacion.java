package com.Cibertec.ProyectoDAMII.Clases;

import jakarta.persistence.*;

@Entity
@Table(name = "T_Habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitacion")
    private int idHabitacion;

    @Column(name = "numero_habitacion", nullable = false)
    private int numeroHabitacion;

    @Column(name = "precio_noche", nullable = false)
    private double precioNoche;

    @Column(name = "estado")
    private String estado;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructor por defecto
    public Habitacion() {
    }

    // Constructor con todos los parámetros
    public Habitacion(int numeroHabitacion, double precioNoche, String estado, String tipo, String descripcion) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNoche = precioNoche;
        this.estado = estado;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
