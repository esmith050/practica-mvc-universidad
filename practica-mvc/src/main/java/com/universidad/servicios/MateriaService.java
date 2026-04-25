package com.universidad.servicios;

import com.universidad.dao.MateriaDao;
import com.universidad.model.Materia;

public class MateriaService {

    private MateriaDao dao = new MateriaDao();

    public void crear(Materia materia) {
        dao.guardar(materia);
    }
}