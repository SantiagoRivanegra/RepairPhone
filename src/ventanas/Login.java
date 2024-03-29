/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;;

/**
 *
 * @author SANTIAGO
 */
public class Login extends javax.swing.JFrame {
    public static String user = "";
    String pass = "";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(600,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Acceso al Sistema");
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),jLabel_Wallpaper.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpaper_logo = new ImageIcon("src/images/icono.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
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

        jButton_ingresar = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        jLabel_Logo = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_ingresar.setBackground(new java.awt.Color(51, 51, 51));
        jButton_ingresar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton_ingresar.setForeground(new java.awt.Color(153, 204, 255));
        jButton_ingresar.setText("INGRESAR");
        jButton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 140, 50));

        txt_pass.setBackground(new java.awt.Color(153, 204, 255));
        txt_pass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(51, 51, 51));
        txt_pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 200, 30));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 150, 100));

        txt_user.setBackground(new java.awt.Color(153, 204, 255));
        txt_user.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_user.setForeground(new java.awt.Color(51, 51, 51));
        txt_user.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 200, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ingresarActionPerformed
        
        user = txt_user.getText().trim();
        pass = txt_pass.getText().trim();
        
        if (!user.equals("") || !pass.equals("")){
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select nivel,estado from usuarios where"
                        + " username = '" + user + "' and password = '" + pass +"'");
                
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()){
                    String nivel = rs.getString("nivel");
                    String estado = rs.getString("estado");
                    
                    if(nivel.equalsIgnoreCase("Administrador") && estado.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Administrador().setVisible(true);
                    } else if(nivel.equalsIgnoreCase("Empleado") && estado.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Empleado().setVisible(true);
                    } else if (nivel.equalsIgnoreCase("Empleado") && estado.equalsIgnoreCase("Inactivo")){
                        JOptionPane.showMessageDialog(null,"Usuario inactivo");
                    }               
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de incorrectos");
                    txt_pass.setText("");
                }
                
            } catch (SQLException e) {
                System.err.println("Error en el boton acceder");
                JOptionPane.showMessageDialog(null, "Error al inciar sesion, contacte al administrador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
        
        
    }//GEN-LAST:event_jButton_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ingresar;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
