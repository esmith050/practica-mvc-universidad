package com.universidad.controlador;

import com.universidad.model.Materia;
import com.universidad.servicios.MateriaService;

public class ControladorMateria {

    private MateriaService service = new MateriaService();

    public void crear(int id, String nombre, int creditos) {
        Materia m = new Materia(id, nombre, creditos);
        service.crear(m);
    }
}