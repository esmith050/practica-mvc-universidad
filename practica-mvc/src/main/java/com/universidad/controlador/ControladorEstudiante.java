package com.universidad.controlador;

import com.universidad.model.Estudiante;
import com.universidad.servicios.EstudianteService;

public class ControladorEstudiante {

    private EstudianteService service = new EstudianteService();

    public void crear(int id, String nombre, String apellido, String email) {
        Estudiante e = new Estudiante(id, nombre, apellido, email);
        service.crear(e);
    }
}