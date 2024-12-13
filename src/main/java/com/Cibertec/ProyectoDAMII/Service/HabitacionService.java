package com.Cibertec.ProyectoDAMII.Service;

import com.Cibertec.ProyectoDAMII.Clases.Habitacion;
import com.Cibertec.ProyectoDAMII.Repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitacionService {
    @Autowired
    private HabitacionRepository habitacionRepository;

    public boolean cambiarEstadoHabitacion(int idHabitacion, String estado) {
        Optional<Habitacion> habitacionOpt = habitacionRepository.findById(idHabitacion);

        if (habitacionOpt.isPresent()) {
            Habitacion habitacion = habitacionOpt.get();
            if ("Libre".equalsIgnoreCase(estado) || "Ocupada".equalsIgnoreCase(estado)) {
                habitacion.setEstado(estado);
                habitacionRepository.save(habitacion);
                return true;
            }
        }
        return false;
    }


    public List<Habitacion> obtenerHabitacionesPorEstado(String estado) {
        return habitacionRepository.findByEstado(estado);
    }
}
