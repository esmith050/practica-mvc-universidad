package com.universidad.dao;

import com.universidad.model.Materia;
import com.universidad.config.ConexionPostgresDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MateriaDao {

    public void guardar(Materia materia) {
        String sql = "INSERT INTO materia (id, nombre, creditos) VALUES (?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, materia.getId());
            ps.setString(2, materia.getNombre());
            ps.setInt(3, materia.getCreditos());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Materia> listar() {
        List<Materia> lista = new ArrayList<>();
        String sql = "SELECT * FROM materia";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Materia m = new Materia(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("creditos")
                );
                lista.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}