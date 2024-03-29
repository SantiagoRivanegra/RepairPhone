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
import javax.swing.WindowConstants;

/**
 *
 * @author Santiago
 */
public class Servicios extends javax.swing.JFrame {
    String user;
    
    /**
     * Creates new form Servicios
     */
    public Servicios() {
        initComponents();
        user = Login.user;
        
        setTitle("Servicios - Sesion de " + user);
        setSize(350,180);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
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

        jButton_venta = new javax.swing.JButton();
        jButton_reparacion = new javax.swing.JButton();
        jButton_ventasRealizadas = new javax.swing.JButton();
        jButton_reparacionesRealizadas = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_venta.setBackground(new java.awt.Color(51, 51, 51));
        jButton_venta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_venta.setForeground(new java.awt.Color(153, 204, 255));
        jButton_venta.setText("VENTA");
        jButton_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ventaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, 130, 50));

        jButton_reparacion.setBackground(new java.awt.Color(51, 51, 51));
        jButton_reparacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_reparacion.setForeground(new java.awt.Color(153, 204, 255));
        jButton_reparacion.setText("REPARACION");
        jButton_reparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reparacionActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 25, 130, 50));

        jButton_ventasRealizadas.setBackground(new java.awt.Color(51, 51, 51));
        jButton_ventasRealizadas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_ventasRealizadas.setForeground(new java.awt.Color(153, 204, 255));
        jButton_ventasRealizadas.setText("<html>VENTAS <p>REALIZADAS<html>");
        jButton_ventasRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ventasRealizadasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_ventasRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 50));

        jButton_reparacionesRealizadas.setBackground(new java.awt.Color(51, 51, 51));
        jButton_reparacionesRealizadas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_reparacionesRealizadas.setForeground(new java.awt.Color(153, 204, 255));
        jButton_reparacionesRealizadas.setText("<html>REPARACIONES <p>REALIZADAS<html>");
        jButton_reparacionesRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reparacionesRealizadasActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_reparacionesRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, 50));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ventaActionPerformed
        this.setVisible(false);
        Venta venta = new Venta();
        venta.setVisible(true);
    }//GEN-LAST:event_jButton_ventaActionPerformed

    private void jButton_reparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reparacionActionPerformed
        this.setVisible(false);
        Reparacion reparacion = new Reparacion();
        reparacion.setVisible(true);
    }//GEN-LAST:event_jButton_reparacionActionPerformed

    private void jButton_ventasRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ventasRealizadasActionPerformed
        VentasRealizadas ventaRealizada = new VentasRealizadas();
        ventaRealizada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_ventasRealizadasActionPerformed

    private void jButton_reparacionesRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reparacionesRealizadasActionPerformed
        ReparacionesRealizadas reparacionRealizada = new ReparacionesRealizadas();
        reparacionRealizada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_reparacionesRealizadasActionPerformed

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
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_reparacion;
    private javax.swing.JButton jButton_reparacionesRealizadas;
    private javax.swing.JButton jButton_venta;
    private javax.swing.JButton jButton_ventasRealizadas;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
