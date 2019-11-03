/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick Daniel
 */
public class Consulta extends javax.swing.JFrame {

    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();

    public Consulta() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagen;
        Icon icono;
        imagen = new ImageIcon("src/imagenes/admi_background.jpg");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);
        JOptionPane.showMessageDialog(null,"Bienvenido");
    }

    void mostrarTablaPC(){
        Statement st;
        ResultSet rs;
        String consulta1 = "SELECT * FROM computadoras";
        String datos[] = new String[3];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Computadora");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        TablaDatos.setModel(modelo);
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consulta1);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void mostrarTablaCarreras(){
        Statement st;
        ResultSet rs;
        String consulta1 = "SELECT * FROM carreras";
        String datos[] = new String[3];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Carrera");
        modelo.addColumn("Nombre");
        modelo.addColumn("Clave");
        TablaDatos.setModel(modelo);
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consulta1);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void mostrarTablaSesion(){
        Statement st;
        ResultSet rs;
        String consulta1 = "SELECT * FROM control_sesion";
        String datos[] = new String[7];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Sesion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora inicio");
        modelo.addColumn("Hora final");
        modelo.addColumn("Semestre");
        modelo.addColumn("Cuenta");
        modelo.addColumn("ID Computadora");
        TablaDatos.setModel(modelo);
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consulta1);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void mostrarTablaAlumnos(){
        Statement st;
        ResultSet rs;
        String consulta1 = "SELECT * FROM alumnos";
        String datos[] = new String[5];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cuenta");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Carrera");
        TablaDatos.setModel(modelo);
        try {
            st = cn.createStatement();
            rs = st.executeQuery(consulta1);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                switch(rs.getString(5)){
                    case "100":
                        datos[4] = "LAC";
                        break;
                    case "200":
                        datos[4] = "LAM";
                        break;
                    case "300":
                        datos[4] = "LCN";
                        break;
                    case "400":
                        datos[4] = "LRE";
                        break;
                    case "500":
                        datos[4] = "LDE";
                        break;
                    case "600":
                        datos[4] = "LEC";
                        break;
                    case "700":
                        datos[4] = "LIA";
                        break;
                    case "800":
                        datos[4] = "ICO";
                        break;
                    case "900":
                        datos[4] = "ISC";
                        break;
                    case "1000":
                        datos[4] = "IIN";
                        break;
                }
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BoxUno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 740, 400));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cerrar sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 40, -1));

        BoxUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos", "Carreras", "Computadoras", "Sesiones" }));
        BoxUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxUnoActionPerformed(evt);
            }
        });
        getContentPane().add(BoxUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cadena = BoxUno.getSelectedItem().toString();
        if(cadena.equals("Alumnos")){
            mostrarTablaAlumnos();
        }
        if(cadena.equals("Computadoras")){
            mostrarTablaPC();
        }
        if(cadena.equals("Carreras")){
            mostrarTablaCarreras();
        }
        if(cadena.equals("Sesiones")){
            mostrarTablaSesion();
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BoxUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxUnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxUnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon_app.png"));
        return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxUno;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
