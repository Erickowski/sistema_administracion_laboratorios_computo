package Ventanas.pruebas;

import Ventanas.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExisteRegistro {
    

    public static void main(String[] args){
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        String cuenta = "1526690";
        String sql = "SELECT * FROM alumnos WHERE cuenta = " + cuenta;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                System.out.println("Si existe");
            } else {
                System.out.println("No existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExisteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
