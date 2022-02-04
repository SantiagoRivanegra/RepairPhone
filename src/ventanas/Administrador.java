/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import clases.Conexion;
import java.sql.*;

/**
 *
 * @author SANTIAGO
 */
public class Administrador extends javax.swing.JFrame {
    String user, nombre_usuario = "";     

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        user = Login.user;
        
        setSize(600,400);
        setLocationRelativeTo(this);
        setResizable(false);
        setTitle("Administrador - Sesion de " + user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),jLabel_Wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select nombre_usuario from usuarios where username = '" + user + "'");
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_user.setText(nombre_usuario);
            }
        } catch (SQLException e) {
            System.err.print("Error e la interfaz de Administracion");
        }
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icono.png"));
        return retValue;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_login = new javax.swing.JButton();
        jButton_registrarUsuario = new javax.swing.JButton();
        jButton_gestionarUsuario = new javax.swing.JButton();
        jButton_registrarCliente = new javax.swing.JButton();
        jButton_gestionatCliente = new javax.swing.JButton();
        jButton_Servicios = new javax.swing.JButton();
        jLabel_user = new javax.swing.JLabel();
        jButton_Stock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_login.setBackground(new java.awt.Color(51, 51, 51));
        jButton_login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(153, 204, 255));
        jButton_login.setText("ATRAS");
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, -1));

        jButton_registrarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jButton_registrarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_registrarUsuario.setForeground(new java.awt.Color(153, 204, 255));
        jButton_registrarUsuario.setText("<html>Registrar <p>Usuarios<html>");
        jButton_registrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, 75));

        jButton_gestionarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jButton_gestionarUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_gestionarUsuario.setForeground(new java.awt.Color(153, 204, 255));
        jButton_gestionarUsuario.setText("<html>Gestionar <p>Usuarios<html>");
        jButton_gestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gestionarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_gestionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 75));

        jButton_registrarCliente.setBackground(new java.awt.Color(51, 51, 51));
        jButton_registrarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_registrarCliente.setForeground(new java.awt.Color(153, 204, 255));
        jButton_registrarCliente.setText("<html>Registro <p>Clientes<html>");
        jButton_registrarCliente.setBorder(null);
        jButton_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, 75));

        jButton_gestionatCliente.setBackground(new java.awt.Color(51, 51, 51));
        jButton_gestionatCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_gestionatCliente.setForeground(new java.awt.Color(153, 204, 255));
        jButton_gestionatCliente.setText("<html>Gestionar <p>Clientes<html>");
        jButton_gestionatCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gestionatClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_gestionatCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 110, 75));

        jButton_Servicios.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Servicios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Servicios.setForeground(new java.awt.Color(153, 204, 255));
        jButton_Servicios.setText("Servicios");
        jButton_Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 100, 75));

        jLabel_user.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_user.setText("jLabel1");
        getContentPane().add(jLabel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton_Stock.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Stock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_Stock.setForeground(new java.awt.Color(153, 204, 255));
        jButton_Stock.setText("Stock");
        jButton_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StockActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 100, 75));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Gestionar Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Servicios");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Registrar Cliente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gestionar Clientes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Stock Equipos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_registrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarUsuarioActionPerformed
        RegistrarUsuario registrarUsuario = new RegistrarUsuario();
        registrarUsuario.setVisible(true);
    }//GEN-LAST:event_jButton_registrarUsuarioActionPerformed

    private void jButton_gestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gestionarUsuarioActionPerformed
        GestionarUsuario gestionarUsuario = new GestionarUsuario();
        gestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jButton_gestionarUsuarioActionPerformed

    private void jButton_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarClienteActionPerformed
        RegistrarCliente registrarCliente = new RegistrarCliente();
        registrarCliente.setVisible(true);
    }//GEN-LAST:event_jButton_registrarClienteActionPerformed

    private void jButton_gestionatClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gestionatClienteActionPerformed
        GestionarCliente gestionarCliente = new GestionarCliente();
        gestionarCliente.setVisible(true);
    }//GEN-LAST:event_jButton_gestionatClienteActionPerformed

    private void jButton_ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ServiciosActionPerformed
        Servicios servicios = new Servicios();
        servicios.setVisible(true);
    }//GEN-LAST:event_jButton_ServiciosActionPerformed

    private void jButton_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StockActionPerformed
        Stock stock = new Stock();
        stock.setVisible(true);
    }//GEN-LAST:event_jButton_StockActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Servicios;
    private javax.swing.JButton jButton_Stock;
    private javax.swing.JButton jButton_gestionarUsuario;
    private javax.swing.JButton jButton_gestionatCliente;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_registrarCliente;
    private javax.swing.JButton jButton_registrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_user;
    // End of variables declaration//GEN-END:variables
}