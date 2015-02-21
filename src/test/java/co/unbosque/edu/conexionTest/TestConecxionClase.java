/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.unbosque.edu.conexionTest;
import com.mycompany.basesdedatos.Usuario2;
import com.mycompany.basesdedatos.Usuario1;
import com.mycompany.basesdedatos.Singleton;
import java.sql.Connection;
import org.testng.annotations.Test;
/**
 *
 * @author pablo
 */
public class TestConecxionClase {    
    static Connection conexion = null;
    //aqui se prueva el llamado del metodo de la clase singleton  para conectar una clase
   
    @Test
    public void conectar(){
       
        Usuario1 u= new Usuario1();
         boolean conec= u.estadoDeConexion();
     org.testng.Assert.assertEquals(conec, true) ;      
   }
    
    
    @Test
    public void conectar1(){       
       Usuario2 x= new Usuario2();
         boolean conectado= x.estadoDeConexion();
     org.testng.Assert.assertEquals(conectado, true) ;
      
   } 
}
