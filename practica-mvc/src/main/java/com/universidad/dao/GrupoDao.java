package com.universidad.dao;

import com.universidad.model.Grupo;
import com.universidad.config.ConexionPostgresDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GrupoDao {

    // GUARDAR
    public void guardar(Grupo grupo) {
        String sql = "INSERT INTO grupo (id, id_materia, id_docente, aula, horario) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, grupo.getId());
            ps.setInt(2, grupo.getIdMateria());
            ps.setInt(3, grupo.getIdDocente());
            ps.setString(4, grupo.getAula());
            ps.setString(5, grupo.getHorario());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // LISTAR
    public List<Grupo> listar() {
        List<Grupo> lista = new ArrayList<>();
        String sql = "SELECT * FROM grupo";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Grupo g = new Grupo(
                        rs.getInt("id"),
                        rs.getInt("id_materia"),
                        rs.getInt("id_docente"),
                        rs.getString("aula"),
                        rs.getString("horario")
                );
                lista.add(g);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}