package com.universidad.servicios;

import com.universidad.dao.InscripcionCursoDao;
import com.universidad.model.InscripcionCurso;

public class InscripcionCursoService {

    private InscripcionCursoDao dao = new InscripcionCursoDao();

    public void crear(InscripcionCurso inscripcion) {
        dao.guardar(inscripcion);
    }
}
