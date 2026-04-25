package com.universidad.servicios;

import com.universidad.dao.GrupoDao;
import com.universidad.model.Grupo;
import java.util.List;

public class GrupoService {

    private GrupoDao dao = new GrupoDao();

    public void crear(Grupo grupo) {
        dao.guardar(grupo);
    }

    public List<Grupo> listar() {
        return dao.listar();
    }
}
