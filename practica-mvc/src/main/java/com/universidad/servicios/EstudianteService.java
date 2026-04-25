package com.universidad.servicios;

import com.universidad.dao.EstudianteDao;
import com.universidad.model.Estudiante;

public class EstudianteService {

    private EstudianteDao dao = new EstudianteDao();

    public void crear(Estudiante estudiante) {
        dao.guardar(estudiante);
    }
}