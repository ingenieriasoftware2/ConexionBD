/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basesdedatos;

import static com.mycompany.basesdedatos.Singleton.getconnetion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pablo
 */
public class Usuario2 {

    public boolean estadoDeConexion() {
        boolean valor = false;

        if (getconnetion() != null) {
            valor = true;
        }
        return valor;
    }

  
   
    
    

}
