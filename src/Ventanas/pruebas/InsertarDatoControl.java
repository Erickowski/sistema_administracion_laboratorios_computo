package Ventanas.pruebas;

import Ventanas.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertarDatoControl {
    public static void main(String[] args){
        ConexionBD con = new ConexionBD();
        Connection cn = con.conexion();
        String sql = "SELECT * FROM control_sesion";
        Date date = new Date();
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String hora = hourFormat.format(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = dateFormat.format(date);
        int cuenta = 1572238;
        int sesion = 0;
        int computadora = 0;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.last()){
                sesion = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExisteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql = "SELECT * FROM computadoras";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString(2).equals("Disponible")){
                    computadora = rs.getInt(1);
                    break;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExisteRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO control_sesion (id_sesion,fecha,hora_inicio,hora_final,semestre,cuenta,id_computadora) VALUES (?,?,?,?,?,?,?)");
            pps.setInt(1,sesion + 1);
            pps.setString(2,fecha);
            pps.setString(3,hora);
            pps.setString(4,"24:00:00");
            pps.setString(5,"2018B");
            pps.setInt(6,cuenta);
            pps.setInt(7,computadora);
            pps.executeUpdate();
            System.out.println("Datos guardados");
        } catch (SQLException ex) {
            System.out.println("Datos no guardados");
            Logger.getLogger(InsertarDatoControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
