/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.implementDao;

import com.dao.LoginDao;
import com.modelo.Usuario;

/**
 *
 * @author PC
 */
public class LoginImplemtDao implements LoginDao {

    @Override
    public boolean validarUsuario(Usuario login) {
//        if (login.getClave().equalsIgnoreCase("diego@gimal.com")
//                & login.getEstudiante().getEmail().equals("123")) {
            return true;
//        } hay que hacer la sentencia sql para la existencia del login
//        return false;
    }

}
