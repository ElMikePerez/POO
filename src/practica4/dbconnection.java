/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;
import java.sql.*;

/**
 *
 * @author pc18
 */
public class dbconnection {
    
    Connection conn = null;
    
    Connection conexion(){
        try{
        String mydriver = "org.gjt.mm.mysql.Driver";
        String MyUrl = "jdbc:mysql://localhost/test";
        Connection conn = DriverManager.getConnection(MyUrl, "root", "12345");
        Statement at = conn.createStatement();
        }
        catch(Exception e)
        {
            System.err.println("ERROR AL CONECTAR A LA BASE");
            System.err.println(e.getMessage());
        }
        return conn;
    }
}
