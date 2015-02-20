
import java.sql.Connection;
import java.sql.DriverManager;
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
    
    @Test
    public void Pruebaconexion(){
    Connection conexion=null;
        try {
            String cadenaConexion = "jdbc:postgresql://nuevo.aretico.com:5432/software_2";
            String usuario="grupo3";
            String clave="software2";
            
            Class.forName("org.postgresql.Driver");
            
            
            conexion = DriverManager.getConnection(cadenaConexion,usuario,clave);
            Assert.assertNotNull(conexion);
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            Assert.fail();
            
        }finally{
        if (conexion!=null)
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TestConexionBD.class.getName()).log(Level.SEVERE ,null,ex);
            }
        
        }
         
        
        
    }
    
}
