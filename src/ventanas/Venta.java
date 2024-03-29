/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import clases.Conexion;
import java.sql.*;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author Santiago
 */
public class Venta extends javax.swing.JFrame {

    String user;

    /**
     * Creates new form Compra
     */
    public Venta() {
        initComponents();
        user = Login.user;

        setSize(550, 430);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Venta - Sesion de " + user);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        ImageIcon lupa = new ImageIcon("src/images/lupa.jpg");
        Icon botonLupa = new ImageIcon(lupa.getImage().getScaledInstance(jButton_buscarCliente.getWidth(), jButton_buscarCliente.getHeight(), Image.SCALE_DEFAULT));
        jButton_buscarCliente.setIcon(botonLupa);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
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
        jLabel7 = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        jButton_buscarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        txt_nombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_CUIT = new javax.swing.JTextField();
        jButton_registrarCliente = new javax.swing.JButton();
        jButton_stockNotebook = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jButton_stockSmartphone = new javax.swing.JButton();
        jButton_confirmaCompra = new javax.swing.JButton();
        txt_tipo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setText("DNI:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txt_DNI.setBackground(new java.awt.Color(204, 204, 204));
        txt_DNI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_DNI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, 25));

        jButton_buscarCliente.setBackground(new java.awt.Color(51, 51, 51));
        jButton_buscarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_buscarCliente.setForeground(new java.awt.Color(153, 204, 255));
        jButton_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 55, 40, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Mail:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Direccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txt_direccion.setBackground(new java.awt.Color(204, 204, 204));
        txt_direccion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Nombre Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_mail.setBackground(new java.awt.Color(204, 204, 204));
        txt_mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_mail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 25));

        txt_nombreCliente.setBackground(new java.awt.Color(204, 204, 204));
        txt_nombreCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_nombreCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txt_telefono.setBackground(new java.awt.Color(204, 204, 204));
        txt_telefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, 25));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setText("CUIT:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txt_CUIT.setBackground(new java.awt.Color(204, 204, 204));
        txt_CUIT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_CUIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_CUIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 25));

        jButton_registrarCliente.setBackground(new java.awt.Color(51, 51, 51));
        jButton_registrarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_registrarCliente.setForeground(new java.awt.Color(153, 204, 255));
        jButton_registrarCliente.setText("Registar");
        jButton_registrarCliente.setBorder(null);
        jButton_registrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 55, 100, 30));

        jButton_stockNotebook.setBackground(new java.awt.Color(51, 51, 51));
        jButton_stockNotebook.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_stockNotebook.setForeground(new java.awt.Color(153, 204, 255));
        jButton_stockNotebook.setText("Notebook");
        jButton_stockNotebook.setBorder(null);
        jButton_stockNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stockNotebookActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_stockNotebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 100, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setText("Marca:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        txt_marca.setBackground(new java.awt.Color(204, 204, 204));
        txt_marca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_marca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 170, 25));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setText("Modelo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        txt_modelo.setBackground(new java.awt.Color(204, 204, 204));
        txt_modelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_modelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 170, 25));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setText("Precio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        txt_precio.setBackground(new java.awt.Color(204, 204, 204));
        txt_precio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_precio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 170, 25));

        jButton_stockSmartphone.setBackground(new java.awt.Color(51, 51, 51));
        jButton_stockSmartphone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_stockSmartphone.setForeground(new java.awt.Color(153, 204, 255));
        jButton_stockSmartphone.setText("Smartphone");
        jButton_stockSmartphone.setBorder(null);
        jButton_stockSmartphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stockSmartphoneActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_stockSmartphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 100, 30));

        jButton_confirmaCompra.setBackground(new java.awt.Color(51, 51, 51));
        jButton_confirmaCompra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_confirmaCompra.setForeground(new java.awt.Color(153, 204, 255));
        jButton_confirmaCompra.setText("Confirmar");
        jButton_confirmaCompra.setBorder(null);
        jButton_confirmaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_confirmaCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_confirmaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, 50));

        txt_tipo.setBackground(new java.awt.Color(204, 204, 204));
        txt_tipo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_tipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 170, 25));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("Tipo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarClienteActionPerformed
        String dni;
        dni = txt_DNI.getText().trim();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from clientes where DNI = '" + dni + "'");
            ResultSet rs = pst.executeQuery();

            if (dni.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un DNI valido");
                txt_nombreCliente.setText("");
                txt_CUIT.setText("");
                txt_direccion.setText("");
                txt_mail.setText("");
                txt_telefono.setText("");
            } else if (rs.next()) {

                txt_nombreCliente.setText(rs.getString("nombre_cliente"));
                txt_nombreCliente.setEnabled(false);
                txt_CUIT.setText(rs.getString("CUIT"));
                txt_CUIT.setEnabled(false);
                txt_direccion.setText(rs.getString("direccion_cliente"));
                txt_direccion.setEnabled(false);
                txt_mail.setText(rs.getString("mail_cliente"));
                txt_mail.setEnabled(false);
                txt_telefono.setText(rs.getString("telefono_cliente"));
                txt_telefono.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un DNI valido");
                txt_nombreCliente.setText("");
                txt_CUIT.setText("");
                txt_direccion.setText("");
                txt_mail.setText("");
                txt_telefono.setText("");
            }
        } catch (SQLException e) {
            System.out.println("Error en cargar cliente");
            JOptionPane.showMessageDialog(null, "Error al cargar cliente");
        }
    }//GEN-LAST:event_jButton_buscarClienteActionPerformed

    private void jButton_registrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarClienteActionPerformed
        RegistrarClienteVenta registrarCliente = new RegistrarClienteVenta();
        registrarCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_registrarClienteActionPerformed

    private void jButton_stockNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stockNotebookActionPerformed
        String marca, modelo, precio;

        StockNoteVenta stockNote = new StockNoteVenta();
        stockNote.setVisible(true);

        marca = StockNoteVenta.marca_note;
        modelo = StockNoteVenta.modelo_note;
        precio = StockNoteVenta.precio_note;
        txt_tipo.setText("Notebook");
        txt_tipo.setEnabled(false);
        txt_marca.setText(marca);
        txt_marca.setEnabled(false);
        txt_modelo.setText(modelo);
        txt_modelo.setEnabled(false);
        txt_precio.setText(precio);
        txt_precio.setEnabled(false);
    }//GEN-LAST:event_jButton_stockNotebookActionPerformed

    private void jButton_stockSmartphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stockSmartphoneActionPerformed
        String marca, modelo, precio;

        StockSmartVenta stockSmart = new StockSmartVenta();
        stockSmart.setVisible(true);

        marca = StockSmartVenta.marca_smart;
        modelo = StockSmartVenta.modelo_smart;
        precio = StockSmartVenta.precio_smart;
        
        
        txt_tipo.setText("Smartphone");
        txt_tipo.setEnabled(false);
        txt_marca.setText(marca);
        txt_marca.setEnabled(false);
        txt_modelo.setText(modelo);
        txt_modelo.setEnabled(false);
        txt_precio.setText(precio);
        txt_precio.setEnabled(false);
    }//GEN-LAST:event_jButton_stockSmartphoneActionPerformed

    private void jButton_confirmaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_confirmaCompraActionPerformed
        String cuit, dni , nombre, mail, direccion, telefono, marca, modelo, precio, tipo;
        int validar = 0, stock = 0;

        dni = txt_DNI.getText().trim();
        cuit = txt_CUIT.getText().trim();
        direccion = txt_direccion.getText().trim();
        mail = txt_mail.getText().trim();
        nombre = txt_nombreCliente.getText().trim();
        telefono = txt_telefono.getText().trim();
        tipo = txt_tipo.getText().trim();
        marca = txt_marca.getText().trim();
        modelo = txt_modelo.getText().trim();
        precio = txt_precio.getText().trim();

        if ((dni.equals("")) || (cuit.equals("")) || (direccion.equals("")) || (mail.equals("")) || (nombre.equals("")) || (telefono.equals(""))
                || (marca.equals("")) || (modelo.equals("")) || (precio.equals(""))) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            validar++;
        }

        if (validar == 0) {            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into ventas values (?,?,?,?,?,?,?,?,?,?,?)");

                pst.setInt(1,0);
                pst.setString(2, dni);
                pst.setString(3, cuit);
                pst.setString(4, nombre);
                pst.setString(5, direccion);
                pst.setString(6, telefono);
                pst.setString(7, mail);
                pst.setString(8, tipo);
                pst.setString(9, marca);
                pst.setString(10, modelo);
                pst.setString(11, precio);

                pst.executeUpdate();
                cn.close();
                
                JOptionPane.showMessageDialog(null, "Venta realizada con exito");
                this.dispose();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al realizar la venta");
                System.err.println("Error al poner datos en BD" + e);
            }
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select cantidad from stock where modelo ='" + modelo + "'");
                ResultSet rs = pst.executeQuery();
                
                if (rs.next()){
                    stock = rs.getInt("cantidad");
                    stock = stock - 1;
                    
                    if (stock == 0){
                        JOptionPane.showMessageDialog(null,"Se ha venidido la ultima unidad de este equipo: " + tipo + " " + marca + " " + modelo + "");
                    }
                    
                    try {
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement("update stock set cantidad=? where modelo ='" + modelo + "'");
                        
                        pst2.setInt(1, stock);
                        
                        pst2.executeUpdate();
                        cn2.close();
                    } catch (SQLException e) {
                        System.err.println("Error en reducir stock");
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error en reducir stock2");
            }

        }

    }//GEN-LAST:event_jButton_confirmaCompraActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscarCliente;
    private javax.swing.JButton jButton_confirmaCompra;
    private javax.swing.JButton jButton_registrarCliente;
    private javax.swing.JButton jButton_stockNotebook;
    private javax.swing.JButton jButton_stockSmartphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_CUIT;
    private javax.swing.JTextField txt_DNI;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
