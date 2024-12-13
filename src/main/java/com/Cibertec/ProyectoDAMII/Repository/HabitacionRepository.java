package com.Cibertec.ProyectoDAMII.Repository;

import com.Cibertec.ProyectoDAMII.Clases.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
    List<Habitacion> findByEstado(String estado);
}
