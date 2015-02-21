/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.basesdedatos;

import java.sql.Connection;

/**
 *
 * @author pablo
 */
public class Usuario2 {

    public boolean estadoDeConexion() {
         boolean valor=false;
        
        Connection c = Singleton.getconnetion();
         if (c!=null) {
        valor=true;        
        }
        return valor;
       }
    
}
