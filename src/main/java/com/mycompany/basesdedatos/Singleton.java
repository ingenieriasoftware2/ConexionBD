/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.basesdedatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;


/**
 *
 * @author pablo
 */
public class Singleton {
    static  Connection conexion=null;
 
  public static Connection getconnetion() {
     try {
            String cadenaConexion = "jdbc:postgresql://nuevo.aretico.com:5432/software_2";
            String usuario="grupo3";
            String clave="software2";
            
            Class.forName("org.postgresql.Driver");
            
         
             
         
 
            conexion = DriverManager.getConnection(cadenaConexion,usuario,clave);
            Assert.assertNotNull(conexion);
            
          
        } catch (Exception ex) {
            ex.printStackTrace();
         //  Assert.fail();
             return conexion;
            
        }finally{
        if (conexion!=null)
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE ,null,ex);
            }
     }
     return conexion;
    }
    
}
