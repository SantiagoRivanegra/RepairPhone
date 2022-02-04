package clases;

import java.sql.*;

public class Conexion {
    //conexion local
    public static Connection conectar(){
        try{
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/repairphone","root","");
        return cn;
    } catch(SQLException e){
            System.err.println("Error en conexion local" + e);
    }
        return(null);
    }
    
}
