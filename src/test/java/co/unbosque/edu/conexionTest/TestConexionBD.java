package co.unbosque.edu.conexionTest;

import com.mycompany.basesdedatos.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author f212
 */
public class TestConexionBD {

    static Connection conexion = null;
/*
    @Test
    public void pruevaConexion() {

        Singleton singleton = new Singleton();
        Connection c = singleton.getconnetion("grupo", "software");
        org.testng.Assert.assertEquals(c, null);

    }

    @Test
    public void pruevaConexion1() {

        Singleton singleton = new Singleton();
        Connection c = singleton.getconnetion("grupo3", "software2");
        org.testng.Assert.assertNotNull(c);

    }
*/
    
     @Test
    public void pruevaConexion1() {

        Singleton singleton = new Singleton();
        Connection c = singleton.getconnetion();
        org.testng.Assert.assertNotNull(c);

    }
  
}
