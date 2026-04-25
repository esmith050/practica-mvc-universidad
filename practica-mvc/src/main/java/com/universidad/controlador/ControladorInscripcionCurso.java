package com.universidad.controlador;

import com.universidad.model.InscripcionCurso;
import com.universidad.servicios.InscripcionCursoService;

public class ControladorInscripcionCurso {

    private InscripcionCursoService service = new InscripcionCursoService();

    public void crear(int id, int idEstudiante, int idGrupo, double nota, String estado) {
        InscripcionCurso i = new InscripcionCurso(id, idEstudiante, idGrupo, nota, estado);
        service.crear(i);
    }
}
