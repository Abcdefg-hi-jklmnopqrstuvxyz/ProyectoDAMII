package com.Cibertec.ProyectoDAMII.Clases;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "T_Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private int idCliente;

    @Column(name = "tarjeta_credito", length = 20)
    private String tarjetaCredito;

    @Column(name = "direccion", length = 255)
    private String direccion;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "fecha_reg")
    private Date fechaReg;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "clave", length = 16)
    private String clave;

    @Column(name = "DNI", length = 15, nullable = false)
    private String dni;

    @Column(name = "estado", length = 20)
    private String estado;

    // Constructores
    public Cliente() {
    }

    public Cliente(int idCliente, String tarjetaCredito, String direccion, String nombre, String apellido, Date fechaReg,
                   String telefono, String email, String clave, String dni, String estado) {
        this.idCliente = idCliente;
        this.tarjetaCredito = tarjetaCredito;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaReg = fechaReg;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
        this.dni = dni;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
