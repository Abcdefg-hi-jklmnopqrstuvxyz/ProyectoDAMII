package com.Cibertec.ProyectoDAMII.Controller;

import com.Cibertec.ProyectoDAMII.Clases.Habitacion;
import com.Cibertec.ProyectoDAMII.Service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {
    @Autowired
    private HabitacionService habitacionService;

    @PostMapping("/cambiarEstado")
    public ResponseEntity<String> cambiarEstado(@RequestParam int idHabitacion, @RequestParam String estado) {
        boolean exito = habitacionService.cambiarEstadoHabitacion(idHabitacion, estado);

        if (exito) {
            return ResponseEntity.ok("Estado de la habitación actualizado a " + estado);
        } else {
            return ResponseEntity.status(400).body("Error: La habitación no existe o el estado no es válido.");
        }
    }

    @GetMapping("/estado")
    public ResponseEntity<?> obtenerHabitacionesPorEstado(@RequestParam String estado) {
        if (!estado.equalsIgnoreCase("Libre") && !estado.equalsIgnoreCase("Ocupada")) {
            return ResponseEntity.status(400).body("Los estados que se admiten son 'Libre' o 'Ocupada'");
        }

        List<Habitacion> habitaciones = habitacionService.obtenerHabitacionesPorEstado(estado);

        if (habitaciones.isEmpty()) {
            return ResponseEntity.status(404).body("No se encontraron habitaciones con el estado: " + estado);
        } else {
            return ResponseEntity.ok(habitaciones);
        }
    }
}
