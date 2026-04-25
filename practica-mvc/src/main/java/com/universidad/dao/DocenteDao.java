package com.universidad.dao;

import com.universidad.model.Docente;
import com.universidad.config.ConexionPostgresDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DocenteDao {

    
    public void guardar(Docente docente) {
        String sql = "INSERT INTO docente (id, nombre, especialidad) VALUES (?, ?, ?)";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, docente.getId());
            ps.setString(2, docente.getNombre());
            ps.setString(3, docente.getEspecialidad());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Docente> listar() {
        List<Docente> lista = new ArrayList<>();
        String sql = "SELECT * FROM docente";

        try (Connection conn = ConexionPostgresDatabase.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Docente d = new Docente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("especialidad")
                );
                lista.add(d);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
