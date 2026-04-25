package com.universidad.controlador;

import com.universidad.model.Docente;
import com.universidad.servicios.DocenteService;

public class ControladorDocente {

    private DocenteService service = new DocenteService();

    public void crear(int id, String nombre, String especialidad) {
        Docente d = new Docente(id, nombre, especialidad);
        service.crear(d);
    }
}