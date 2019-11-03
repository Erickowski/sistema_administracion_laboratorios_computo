package Ventanas;

import Ventanas.pruebas.ExisteRegistro;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public final class Main extends javax.swing.JFrame {

    ConexionBD con = new ConexionBD();
    Connection cn = con.conexion();
    int[] PCusing = new int[30];
    int i;
    
    public Main() {
        initComponents();
        for(int j=0; j<30; j++){
            PCusing[j] = 0;
        }
        ImageIcon imagen;
        Icon icono;
        this.setLocationRelativeTo(null);
        imagen = new ImageIcon("src/imagenes/main_background.png");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);
        imagen = new ImageIcon("src/imagenes/account.png");
        icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(), Image.SCALE_DEFAULT));
        jLabel3.setIcon(icono);
        String sql = "SELECT * FROM computadoras";
        int pc;
        String estado;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                pc = rs.getInt(1);
                estado = rs.getString(3);
                procedimiento(pc,estado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Acceder");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, -1));

        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 110, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 100, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PC 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PC 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 100, 100));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PC 3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 100, 100));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PC 4");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 100, 100));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PC 5");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 100, 100));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 100, 100));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PC 6");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 335, -1, -1));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 225, 100, 100));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PC 7");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 335, -1, -1));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 225, 100, 100));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PC 8");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 335, -1, -1));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 225, 100, 100));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PC 9");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 335, -1, -1));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 225, 100, 100));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PC 10");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 335, -1, -1));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 225, 100, 100));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("PC 11");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 335, -1, -1));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 225, 100, 100));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PC 12");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 335, -1, -1));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 225, 100, 100));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PC 13");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 335, -1, -1));
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 100, 100));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("PC 14");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, 100));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("PC 15");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, -1, -1));
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 100, 100));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("PC 16");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 100, 100));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("PC 17");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, -1, -1));
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 100, 100));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("PC 18");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, -1, -1));
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 100));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("PC 19");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, -1, -1));
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 100, 100));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("PC 20");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, -1, -1));
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 100, 100));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("PC 21");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Semestre: 2018B");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 110, -1));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1025, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(txtCuenta.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"No has insertado tu numero de cuenta");
        }
        else{
            String nombre = null;
            String PC = null;
            int sesion = 0;
            int computadora = 0;
            Date date = new Date();
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            String cuenta = txtCuenta.getText();
            String sql = "SELECT * FROM alumnos WHERE cuenta = " + cuenta;
            String hora = hourFormat.format(date);
            String fecha = dateFormat.format(date);
            PreparedStatement pps;
            Statement st;
            ResultSet rs;
            try {
                st = cn.createStatement();
                rs = st.executeQuery(sql);
                if(rs.next()){
                    nombre = rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(2) ;
                    sql = "SELECT * FROM control_sesion WHERE cuenta = " + cuenta;
                    st = cn.createStatement();
                    rs = st.executeQuery(sql);
                    if(rs.last() && rs.getString(4).equals("00:00:00")){
                        computadora = rs.getInt(7);
                        sql = "SELECT * FROM computadoras WHERE id_computadora = " + computadora;
                        st = cn.createStatement();
                        rs = st.executeQuery(sql);
                        while(rs.next()){
                            PC = rs.getString(2);
                        }
                        hora = hourFormat.format(date);
                        pps = cn.prepareStatement("UPDATE computadoras SET estado = 'Disponible' WHERE id_computadora = " + computadora);
                        pps.executeUpdate();
                        procedimiento(computadora,"Disponible");
                        pps = cn.prepareStatement("UPDATE control_sesion SET hora_final = '" + hora + "' WHERE id_computadora = " + computadora);
                        pps.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Hasta luego: " + nombre + "\n PC asignada: " + PC + "\n Hora final: " + hora);    
                    }
                    else{
                        sql = "SELECT * FROM control_sesion";
                        st = cn.createStatement();
                        rs = st.executeQuery(sql);
                        if(rs.last()){
                            sesion = rs.getInt(1);
                        }
                        sql = "SELECT * FROM computadoras";
                        st = cn.createStatement();
                        rs = st.executeQuery(sql);
                        while(rs.next()){
                            if(rs.getString(3).equals("Disponible")){
                                computadora = rs.getInt(1);
                                PC = rs.getString(2);
                                break;
                            }
                        }
                        pps = cn.prepareStatement("UPDATE computadoras SET estado = 'Ocupado' WHERE id_computadora = " + computadora);
                        pps.executeUpdate();
                        procedimiento(computadora,"Ocupado");
                        pps = cn.prepareStatement("INSERT INTO control_sesion (id_sesion,fecha,hora_inicio,hora_final,semestre,cuenta,id_computadora) VALUES (?,?,?,?,?,?,?)");
                        pps.setInt(1,sesion + 1);
                        pps.setString(2,fecha);
                        pps.setString(3,hora);
                        pps.setString(4,"24:00:00");
                        pps.setString(5,"2018B");
                        pps.setString(6,cuenta);
                        pps.setInt(7,computadora);
                        pps.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Bienvenido/a: " + nombre + "\n PC asignada: " + PC + "\n Hora inicio: " + hora);    
                    }                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"El alumno no existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon_app.png"));
        return retValue;
    }
    
    public void procedimiento(int a,String estado){
        ImageIcon imagen = null;
        Icon icono = null;
        if(estado.equals("Disponible")){
            imagen = new ImageIcon("src/imagenes/computer_green.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel4.getWidth(),jLabel4.getHeight(), Image.SCALE_DEFAULT));    
        }
        if(estado.equals("Ocupado")){
            imagen = new ImageIcon("src/imagenes/computer_red.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel4.getWidth(),jLabel4.getHeight(), Image.SCALE_DEFAULT));    
        }
        switch (a){
            case 100:
                jLabel4.setIcon(icono);    
                break;
            case 200:
                jLabel7.setIcon(icono);
                break;
            case 300:
                jLabel9.setIcon(icono);
                break;
            case 400:
                jLabel11.setIcon(icono);
                break;
            case 500:
                jLabel13.setIcon(icono);
                break;
            case 600:
                jLabel14.setIcon(icono);
                break;
            case 700:
                jLabel16.setIcon(icono);
                break;
            case 800:
                jLabel18.setIcon(icono);                
                break;
            case 900:
                jLabel20.setIcon(icono);
                break;
            case 1000:
                jLabel22.setIcon(icono);
                break;
            case 1100:
                jLabel24.setIcon(icono);        
                break;
            case 1200:
                jLabel26.setIcon(icono);
                break;                
            case 1300:
                jLabel28.setIcon(icono);        
                break;
            case 1400:
                jLabel30.setIcon(icono);
                break;
            case 1500:
                jLabel32.setIcon(icono);
                break;
            case 1600:
                jLabel34.setIcon(icono);                
                break;
            case 1700:
                jLabel36.setIcon(icono);
                break;
            case 1800:
                jLabel38.setIcon(icono);
                break;
            case 1900:
                jLabel40.setIcon(icono);
                break;
            case 2000:
                jLabel42.setIcon(icono);
                break;
            case 2100:
                jLabel44.setIcon(icono);                                                                                                                                
                break;                
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}