package Ventanas;

import java.sql.*;

public class ConexionBD {
    Connection cn;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/salc","root","");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return cn;
    }
    Statement createSatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
