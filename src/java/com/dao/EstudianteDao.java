/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.List;

/**
 *
 * @author PC
 */
public interface EstudianteDao<Estudiante> {

    public void guardarEstudiante(Estudiante estudiante);

    public void actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Estudiante estudiante);

    public List<Estudiante> getEstudiantes();
}
