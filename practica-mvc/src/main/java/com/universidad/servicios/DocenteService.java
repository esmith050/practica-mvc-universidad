package com.universidad.servicios;

import com.universidad.dao.DocenteDao;
import com.universidad.model.Docente;

public class DocenteService {

    private DocenteDao dao = new DocenteDao();

    public void crear(Docente docente) {
        dao.guardar(docente);
    }
}