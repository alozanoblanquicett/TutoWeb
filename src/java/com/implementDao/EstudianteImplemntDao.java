/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementDao;

import com.conexion.conexion;
import com.dao.EstudianteDao;
import com.modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class EstudianteImplemntDao implements EstudianteDao<Estudiante> {

    @Override
    public void guardarEstudiante(Estudiante estudiante) {

        Connection connection = null;
        try {

            connection = conexion.conectar();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO usuario values(?,?,?,?,?,?,?,?,?);");
            ps.setString(1, estudiante.getIdentifiacion());
            ps.setString(2, estudiante.getNombre());
            ps.setString(3, estudiante.getApellido());
            ps.setString(4, estudiante.getSexo());
            ps.setString(5, estudiante.getCiudad());
            ps.setString(6, estudiante.getDireccion());
            ps.setString(7, estudiante.getTelefono());
            ps.setString(8, estudiante.getEmail());
            ps.setString(9, estudiante.getTipo());
            ps.executeUpdate();
            ps.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        try {
            Connection connection = null;
            connection = conexion.conectar();

            PreparedStatement ps = connection.prepareStatement("UPDATE usuario SET nombre = ?, apellido = ?,"
                    + "sexo = ?, ciudad = ?, direccion = ?, telefono = ?, email = ?, tipo = ? WHERE identificacion ?");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstudianteImplemntDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {

        Connection connection = null;
        try {
            connection = conexion.conectar();

            String consulta = "delete from usuario where cedula = ?";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ps.setString(1, estudiante.getIdentifiacion());
            ps.executeUpdate();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EstudianteImplemntDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Estudiante> getEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
