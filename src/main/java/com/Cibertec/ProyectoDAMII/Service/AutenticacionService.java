package com.Cibertec.ProyectoDAMII.Service;

import com.Cibertec.ProyectoDAMII.Clases.Usuario;
import com.Cibertec.ProyectoDAMII.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacionService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean login(String correo, String contrasenia) {
        // Buscar el usuario por correo
        Optional<Usuario> usuario = usuarioRepository.findByCorreo(correo);

        // Si el usuario existe, compara la contraseña
        if (usuario.isPresent()) {
            return usuario.get().getContra().equals(contrasenia); // Comparación sin encriptación
        }

        // Si no existe el usuario, devuelve falso
        return false;
    }

    public String register(String correo, String contrasenia) {
        // Verificar si el correo ya existe en la base de datos
        Optional<Usuario> usuarioExistente = usuarioRepository.findByCorreo(correo);
        if (usuarioExistente.isPresent()) {
            return "El usuario ya existe";
        }

        // Si el usuario no existe, lo creamos
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setCorreo(correo);
        nuevoUsuario.setContra(contrasenia); // Contraseña sin encriptación

        // Guardamos el nuevo usuario
        usuarioRepository.save(nuevoUsuario);
        return "Registro exitoso";
    }
}

