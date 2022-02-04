/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import clases.Conexion;
import java.awt.Color;
import java.sql.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Santiago
 */
public class RegistrarUsuario extends javax.swing.JFrame {
    String user;

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarUsuario() {
        initComponents();
        user = Login.user;
        
        setSize(500,350);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Usuarios - Sesion de " + user);
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_nivel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jButton_registrarUsuario = new javax.swing.JButton();
        txt_nombreUsuario = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Nombre Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Username:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        cmb_nivel.setBackground(new java.awt.Color(153, 153, 153));
        cmb_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        getContentPane().add(cmb_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("Nivel:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        txt_password.setBackground(new java.awt.Color(204, 204, 204));
        txt_password.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 170, 25));

        jButton_registrarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jButton_registrarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_registrarUsuario.setForeground(new java.awt.Color(153, 204, 255));
        jButton_registrarUsuario.setText("REGISTRAR");
        jButton_registrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 150, 75));

        txt_nombreUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombreUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_nombreUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 25));

        txt_username.setBackground(new java.awt.Color(204, 204, 204));
        txt_username.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 25));

        txt_mail.setBackground(new java.awt.Color(204, 204, 204));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_mail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 25));

        txt_telefono.setBackground(new java.awt.Color(204, 204, 204));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 170, 25));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarUsuarioActionPerformed
        int nivel, validacion = 0;
        String mail,username, pass, nombre, telefono, nivel_String = "";
        
        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        nombre = txt_nombreUsuario.getText().trim();
        pass = txt_password.getText().trim();
        telefono = txt_telefono.getText().trim();
        nivel = cmb_nivel.getSelectedIndex() + 1;
        
        if (mail.equals("")){
            txt_mail.setBackground(Color.pink);
            validacion++;
        }        
        if (username.equals("")){
            txt_username.setBackground(Color.pink);
            validacion++;
        }        
        if (nombre.equals("")){
            txt_nombreUsuario.setBackground(Color.pink);
            validacion++;
        }        
        if (telefono.equals("")){
            txt_telefono.setBackground(Color.pink);
            validacion++;
        }        
        if (pass.equals("")){
            txt_password.setBackground(Color.pink);
            validacion++;
        }
        
        if(nivel == 1){
            nivel_String = "Administrador";            
        } else if (nivel == 2) {
            nivel_String = "Empleado";        
        }
        
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select username from usuarios where username ='" + username + "'");            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_username.setBackground(Color.pink);
                txt_username.setText("");
                JOptionPane.showMessageDialog(null, "Username no disponible");
                cn.close();                
            } else {
                cn.close();
                
                if(validacion == 0){
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement("insert into usuarios values (?,?,?,?,?,?,?,?)");
                        
                        pst2.setInt(1, 0);
                        pst2.setString(2, nombre);
                        pst2.setString(3, mail);
                        pst2.setString(4, telefono);
                        pst2.setString(5, username);
                        pst2.setString(6, pass);
                        pst2.setString(7, nivel_String);
                        pst2.setString(8, "Activo");
                        
                        pst2.executeUpdate();
                        cn2.close();
                        
                        Limpiar();
                        
                        JOptionPane.showMessageDialog(null,"Registro exitoso");
                        this.dispose();
                                
                    } catch (SQLException e) {
                        System.err.println("Error en registrar usuario" + e);
                        JOptionPane.showMessageDialog(null,"Error al registrar, contacte con el administrador");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
                }                
            }     
            
        } catch (SQLException e) {
            System.err.print("Error en validar nombre de usuario" + e);
            JOptionPane.showMessageDialog(null,"Error al comparar usuario, contacte con el administrador");
        }
    }//GEN-LAST:event_jButton_registrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_nivel;
    private javax.swing.JButton jButton_registrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombreUsuario;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
public void Limpiar(){
        txt_mail.setText("");
        txt_nombreUsuario.setText("");
        txt_password.setText("");
        txt_telefono.setText("");
        txt_username.setText("");
        cmb_nivel.setSelectedIndex(0);
    }
}

