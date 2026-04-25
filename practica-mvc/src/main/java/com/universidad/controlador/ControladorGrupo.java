package com.universidad.controlador;

import com.universidad.model.Grupo;
import com.universidad.servicios.GrupoService;

import java.util.List;

public class ControladorGrupo {

    private GrupoService service = new GrupoService();

    public void crear(int id, int idMateria, int idDocente, String aula, String horario) {
        Grupo g = new Grupo(id, idMateria, idDocente, aula, horario);
        service.crear(g);
    }

    public List<Grupo> listar() {
        return service.listar();
    }
}