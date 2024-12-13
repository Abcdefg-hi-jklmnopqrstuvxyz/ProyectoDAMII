package com.Cibertec.ProyectoDAMII.Repository;


import com.Cibertec.ProyectoDAMII.Clases.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Optional<Cliente> findByEmail(String email);
}
