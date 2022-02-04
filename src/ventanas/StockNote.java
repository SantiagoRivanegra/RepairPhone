/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import static ventanas.GestionarUsuario.user_update;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Santiago
 */
public class StockNote extends javax.swing.JFrame {

    String user, tipo_string;
    public static String modelo_note = "", marca_note = "", marcaEquipo = "";
    DefaultTableModel model = new DefaultTableModel();
    

    /**
     * Creates new form StockNote
     */
    public StockNote() {
        initComponents();
        user = Login.user;
        int i;

        setSize(744, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Stock Notebook - Sesion de " + user);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon lupa = new ImageIcon("src/images/lupa.jpg");
        Icon botonLupa = new ImageIcon(lupa.getImage().getScaledInstance(jButton_buscarNote.getWidth(), jButton_buscarNote.getHeight(), Image.SCALE_DEFAULT));
        jButton_buscarNote.setIcon(botonLupa);
        this.repaint();
        
        

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select marca, modelo, precio, cantidad from stock where tipo = 'Notebook'");
            ResultSet rs = pst.executeQuery();

            jTable_notebook = new JTable(model);
            jScrollPane2.setViewportView(jTable_notebook);

            model.addColumn("Marca");
            model.addColumn("Modelo");
            model.addColumn("Precio $");
            model.addColumn("Cantidad");

            while (rs.next()) {
                Object[] fila = new Object[4];

                for (i = 0; i < 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);

            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en tabla notebook" + e);
            JOptionPane.showMessageDialog(null, "Error en tabla Notebook");
        }
        
        jTable_notebook.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int fila_point = jTable_notebook.rowAtPoint(e.getPoint());
                int columna_point = 1;
                int marca = 0;
                
                
                if(fila_point > -1){
                    modelo_note = (String)model.getValueAt(fila_point, columna_point);
                    marca_note = (String)model.getValueAt(fila_point, marca);
                    InformacionNotebook informacion_notebook = new InformacionNotebook();
                    informacion_notebook.setVisible(true);
                    
                    
                }
                
            }
        });
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_notebook = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton_imprimirStockNote = new javax.swing.JButton();
        txt_marcaNote = new javax.swing.JTextField();
        jButton_buscarNote = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_notebook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable_notebook);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 680, 210));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Stock Notebooks");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jButton_imprimirStockNote.setBackground(new java.awt.Color(51, 51, 51));
        jButton_imprimirStockNote.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_imprimirStockNote.setForeground(new java.awt.Color(153, 204, 255));
        jButton_imprimirStockNote.setText("IMPRIMIR STOCK");
        jButton_imprimirStockNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_imprimirStockNoteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_imprimirStockNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, 50));

        txt_marcaNote.setBackground(new java.awt.Color(204, 204, 204));
        txt_marcaNote.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_marcaNote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_marcaNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 170, 25));

        jButton_buscarNote.setBackground(new java.awt.Color(51, 51, 51));
        jButton_buscarNote.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_buscarNote.setForeground(new java.awt.Color(153, 204, 255));
        jButton_buscarNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarNoteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_buscarNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 40, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_imprimirStockNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_imprimirStockNoteActionPerformed
        Document stockNote = new Document();
        
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(stockNote, new FileOutputStream(ruta + "/desktop/STOCK RP/Stock Notebook.pdf"));
            stockNote.open();
            
            PdfPTable tablaN = new PdfPTable(3);
            tablaN.addCell("Marca");
            tablaN.addCell("Modelo");
            tablaN.addCell("Precio $");
            
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from stock where tipo ='Notebook'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                                       
                    do {                        
                        tablaN.addCell(rs.getString(2));
                        tablaN.addCell(rs.getString(3));
                        tablaN.addCell(rs.getString(4));
                    } while (rs.next());
                    stockNote.add(tablaN);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            stockNote.close();
            JOptionPane.showMessageDialog(null, "Listado de Stock creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }//GEN-LAST:event_jButton_imprimirStockNoteActionPerformed

    private void jButton_buscarNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarNoteActionPerformed
        
        marcaEquipo = txt_marcaNote.getText().trim();
        
        if (marcaEquipo.equals("")){
            
        } else {
        BusquedaNote busquedaNote = new BusquedaNote();
        busquedaNote.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jButton_buscarNoteActionPerformed

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
            java.util.logging.Logger.getLogger(StockNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockNote().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscarNote;
    private javax.swing.JButton jButton_imprimirStockNote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_notebook;
    private javax.swing.JTextField txt_marcaNote;
    // End of variables declaration//GEN-END:variables
}
