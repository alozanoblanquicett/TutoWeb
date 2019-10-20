
package com.modelo;

/**
 *
 * @author PC
 */
public class Docente extends Persona{
    private String codigo;
    private String profesion;

    public Docente() {
    }

    public Docente(String codigo, String profesion, String identifiacion,
            String nombre, String apellido, String sexo, String ciudad, 
            String direccion, String telefono, String email) {
        super(identifiacion, nombre, apellido, sexo, ciudad, direccion, telefono, email);
        this.codigo = codigo;
        this.profesion = profesion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    


  
    
}
