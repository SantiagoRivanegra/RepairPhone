/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import clases.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import static ventanas.GestionarCliente.nombreCliente;

/**
 *
 * @author Santiago
 */
public class RegistrarClienteVenta extends javax.swing.JFrame {
    String user;

    /**
     * Creates new form RegistrarCliente
     */
    public RegistrarClienteVenta() {
        initComponents();
        user = Login.user;
        
        setSize(500,350);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Clientes - Sesion de " + user);
        
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),jLabel_Wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
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

        txt_nombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_registrarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_CUIT = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_nombreCliente.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombreCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_nombreCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Nombre Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jButton_registrarCliente.setBackground(new java.awt.Color(51, 51, 51));
        jButton_registrarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_registrarCliente.setForeground(new java.awt.Color(153, 204, 255));
        jButton_registrarCliente.setText("REGISTRAR");
        jButton_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 75));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txt_mail.setBackground(new java.awt.Color(204, 204, 204));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_mail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(204, 204, 204));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 25));

        txt_direccion.setBackground(new java.awt.Color(204, 204, 204));
        txt_direccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Direccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("DNI:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        txt_DNI.setBackground(new java.awt.Color(204, 204, 204));
        txt_DNI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_DNI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, 25));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("CUIT:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        txt_CUIT.setBackground(new java.awt.Color(204, 204, 204));
        txt_CUIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_CUIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CUIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 170, 25));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarClienteActionPerformed
        int validar = 0;
        String nombre, dni, cuit, mail, telefono, direccion;
        
        nombre = txt_nombreCliente.getText().trim();
        mail = txt_mail.getText().trim();
        telefono = txt_telefono.getText().trim();
        direccion = txt_direccion.getText().trim();
        dni = txt_DNI.getText().trim();
        cuit = txt_CUIT.getText().trim();
        
        if(nombre.equals("")){
            txt_nombreCliente.setBackground(Color.pink);
            validar++;
        }
        if(mail.equals("")){
            txt_mail.setBackground(Color.pink);
            validar++;
        }
        if(telefono.equals("")){
            txt_telefono.setBackground(Color.pink);
            validar++;
        }
        if(direccion.equals("")){
            txt_direccion.setBackground(Color.pink);
            validar++;
        }
        if(dni.equals("")){
            txt_DNI.setBackground(Color.pink);
            validar++;
        }
        if(cuit.equals("")){
            txt_CUIT.setBackground(Color.pink);
            validar++;
        }
        
        if(validar == 0){
            try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("insert into clientes values (?,?,?,?,?,?,?,?)");
            
            pst.setInt(1, 0);
            pst.setString(2, nombre);
            pst.setString(3, mail);
            pst.setString(4, telefono);
            pst.setString(5, direccion);
            pst.setString(6, user);
            pst.setString(7, dni);
            pst.setString(8, cuit);
            
            pst.executeUpdate();
            cn.close();
            
           
            
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                this.dispose();                          
                this.setVisible(false);
                Venta venta = new Venta();
                venta.setVisible(true);
 
                
                
        } catch (SQLException e) {
                System.err.println("Error al registrar cliente" + e);
                JOptionPane.showMessageDialog(null, "Error al registrar cliente");
        }
        } else {
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }
        
        
    }//GEN-LAST:event_jButton_registrarClienteActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistrarClienteVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClienteVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClienteVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClienteVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClienteVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_registrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_CUIT;
    private javax.swing.JTextField txt_DNI;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
