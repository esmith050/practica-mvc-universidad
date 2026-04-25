package com.universidad.dao;

import com.universidad.model.InscripcionCurso;
import com.universidad.config.ConexionPostgresDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InscripcionCursoDao {

    public void guardar(InscripcionCurso inscripcion) {
        String sql = "INSERT INTO inscripcion_curso (id, id_estudiante, id_grupo, nota_final, estado) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, inscripcion.getId());
            ps.setInt(2, inscripcion.getIdEstudiante());
            ps.setInt(3, inscripcion.getIdGrupo());
            ps.setDouble(4, inscripcion.getNotaFinal());
            ps.setString(5, inscripcion.getEstado());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<InscripcionCurso> listar() {
        List<InscripcionCurso> lista = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion_curso";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                InscripcionCurso i = new InscripcionCurso(
                        rs.getInt("id"),
                        rs.getInt("id_estudiante"),
                        rs.getInt("id_grupo"),
                        rs.getDouble("nota_final"),
                        rs.getString("estado")
                );
                lista.add(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
