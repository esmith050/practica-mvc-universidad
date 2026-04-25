package com.universidad;

import com.universidad.controlador.ControladorDocente;
import com.universidad.controlador.ControladorMateria;
import com.universidad.controlador.ControladorEstudiante;
import com.universidad.controlador.ControladorGrupo;
import com.universidad.controlador.ControladorInscripcionCurso;

public class App {

    public static void main(String[] args) {

        System.out.println("=== INICIO DEL SISTEMA ===");

        ControladorDocente docenteController = new ControladorDocente();
        ControladorMateria materiaController = new ControladorMateria();
        ControladorEstudiante estudianteController = new ControladorEstudiante();
        ControladorGrupo grupoController = new ControladorGrupo();
        ControladorInscripcionCurso inscripcionController = new ControladorInscripcionCurso();

        try {

    
            docenteController.crear(1, "Carlos", "Matemáticas");

            materiaController.crear(1, "Programación", 3);

            estudianteController.crear(1, "Juan", "Perez", "juan@email.com");

            grupoController.crear(1, 1, 1, "A101", "8AM-10AM");

            inscripcionController.crear(1, 1, 1, 4.5, "Aprobado");

            System.out.println("=== DATOS INSERTADOS CORRECTAMENTE ===");

        } catch (Exception e) {
            System.out.println(" Error en la ejecución:");
            e.printStackTrace();
        }
    }
}