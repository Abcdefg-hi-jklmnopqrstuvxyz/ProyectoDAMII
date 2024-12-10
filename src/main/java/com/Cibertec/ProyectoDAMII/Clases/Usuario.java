package com.Cibertec.ProyectoDAMII.Clases;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(name = "id_usu")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name = "contra", length = 16)
    private String contra;

    public Usuario() {
    }


    public Usuario(int idUsuario, String correo, String contra) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.contra = contra;
    }


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
