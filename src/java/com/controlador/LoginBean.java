/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.dao.LoginDao;
import com.implementDao.LoginImplemtDao;
import com.modelo.Usuario;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author PC
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private Usuario login = new Usuario();
    private LoginDao loginDao;
   

    public LoginBean() {
    }

    public Usuario getLogin() {
        return login;
    }

    public void setLogin(Usuario login) {
        this.login = login;
    }

    public void login() throws IOException {
        FacesContext contex = FacesContext.getCurrentInstance();
        loginDao = new LoginImplemtDao();
//        if (login.getRol().equalsIgnoreCase("Estudiante")) {
        boolean validar = loginDao.validarUsuario(login);
        if (validar == true) {
            contex.getExternalContext().redirect("/TutoWeb/faces/PortalE.xhtml");
        } else {
            contex.addMessage(null, new FacesMessage("Error Login", "Usuario no Valido"));
        }
//        }

    }

    public void salir() {
        FacesContext contex = FacesContext.getCurrentInstance();
        try {
            if (getLogin() != null) {
                setLogin(new Usuario());
            }
            contex.getExternalContext().redirect("/tutoweb/faces/index.xhtml");
        } catch (IOException ex) {
            contex.addMessage(null, new FacesMessage("Error Login", ex.getMessage()));
        }
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

}
