package com.Cibertec.ProyectoDAMII.Service;

import com.Cibertec.ProyectoDAMII.Clases.Cliente;
import com.Cibertec.ProyectoDAMII.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacionService {

    @Autowired
    private ClienteRepository clienteRepository;

    public String login(String correo, String contrasenia) {
        Optional<Cliente> clienteOpt = clienteRepository.findByEmail(correo);

        if (clienteOpt.isPresent() && clienteOpt.get().getClave().equals(contrasenia)) {
            Cliente cliente = clienteOpt.get();
            return cliente.getNombre();
        }

        return null;
    }

    public String register(String correo, String contrasenia) {
        Optional<Cliente> usuarioExistente = clienteRepository.findByEmail(correo);
        if (usuarioExistente.isPresent()) {
            return "El usuario ya existe";
        }

        Cliente nuevoUsuario = new Cliente();
        nuevoUsuario.setEmail(correo);
        nuevoUsuario.setClave(contrasenia);

        clienteRepository.save(nuevoUsuario);
        return "Registro exitoso";
    }
}

