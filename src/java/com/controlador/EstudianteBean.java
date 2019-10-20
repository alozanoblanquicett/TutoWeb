/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.EstudianteDao;
import com.implementDao.EstudianteImplemntDao;
import com.modelo.Estudiante;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author PC
 */
@Named(value = "estudianteBean")
@SessionScoped
public class EstudianteBean implements Serializable {

    private Estudiante estudiante = new Estudiante();
    private EstudianteDao estudianteDao;

    public EstudianteBean() {
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public EstudianteDao getEstudianteDao() {
        return estudianteDao;
    }

    public void setEstudianteDao(EstudianteDao estudianteDao) {
        this.estudianteDao = estudianteDao;
    }

    public void guardar() {
        estudianteDao = new EstudianteImplemntDao();
        estudianteDao.guardarEstudiante(estudiante);
        setEstudiante(new Estudiante());
    }

    public void actualizar() {
        estudianteDao =new EstudianteImplemntDao();
        estudianteDao.actualizarEstudiante(estudiante);
    }
    
    public void eliminar(){
        estudianteDao= new EstudianteImplemntDao();
        estudianteDao.eliminarEstudiante(estudiante);
    }
}
