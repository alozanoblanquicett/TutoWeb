/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *
 * @author PC
 */
public class Estudiante extends Persona{
 
private String tipo;
private String niverEducativo;

    public Estudiante() {
    }

    public Estudiante(String tipo, String niverEducativo, String identifiacion,
            String nombre, String apellido, String sexo, String ciudad, 
            String direccion, String telefono, String email) {
        super(identifiacion, nombre, apellido, sexo, ciudad, direccion, telefono, email);
        this.tipo = tipo;
        this.niverEducativo = niverEducativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNiverEducativo() {
        return niverEducativo;
    }

    public void setNiverEducativo(String niverEducativo) {
        this.niverEducativo = niverEducativo;
    }
    
    


}
