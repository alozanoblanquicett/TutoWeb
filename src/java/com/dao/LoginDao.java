/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.modelo.Usuario;

/**
 *
 * @author PC
 */
public interface LoginDao {
    public boolean validarUsuario(Usuario login);
}
