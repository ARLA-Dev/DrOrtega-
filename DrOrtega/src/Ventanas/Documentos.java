package Ventanas;

import Globales.Globales;
import Modelos.Modelo;
import Modelos.OperarPaciente;
import javax.swing.JOptionPane;

public class Documentos extends javax.swing.JInternalFrame {

    public Documentos() {
        initComponents();
        setSize(1000, 575);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        generar1 = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        generar2 = new javax.swing.JButton();
        generar3 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Documentos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documento.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setText("GENERAR DOCUMENTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        generar1.setBackground(new java.awt.Color(168, 95, 21));
        generar1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        generar1.setForeground(new java.awt.Color(255, 255, 255));
        generar1.setText("REFERENCIA");
        generar1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        generar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar1.setFocusPainted(false);
        generar1.setMaximumSize(new java.awt.Dimension(120, 35));
        generar1.setMinimumSize(new java.awt.Dimension(120, 35));
        generar1.setPreferredSize(new java.awt.Dimension(120, 35));
        generar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar1ActionPerformed(evt);
            }
        });
        jPanel1.add(generar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        generar.setBackground(new java.awt.Color(168, 95, 21));
        generar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        generar.setForeground(new java.awt.Color(255, 255, 255));
        generar.setText("ORDEN");
        generar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar.setFocusPainted(false);
        generar.setMaximumSize(new java.awt.Dimension(120, 35));
        generar.setMinimumSize(new java.awt.Dimension(120, 35));
        generar.setPreferredSize(new java.awt.Dimension(120, 35));
        jPanel1.add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        generar2.setBackground(new java.awt.Color(168, 95, 21));
        generar2.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        generar2.setForeground(new java.awt.Color(255, 255, 255));
        generar2.setText("REPOSO");
        generar2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        generar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar2.setFocusPainted(false);
        generar2.setMaximumSize(new java.awt.Dimension(120, 35));
        generar2.setMinimumSize(new java.awt.Dimension(120, 35));
        generar2.setPreferredSize(new java.awt.Dimension(120, 35));
        generar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar2ActionPerformed(evt);
            }
        });
        jPanel1.add(generar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        generar3.setBackground(new java.awt.Color(168, 95, 21));
        generar3.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        generar3.setForeground(new java.awt.Color(255, 255, 255));
        generar3.setText("INFORME");
        generar3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        generar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar3.setFocusPainted(false);
        generar3.setMaximumSize(new java.awt.Dimension(120, 35));
        generar3.setMinimumSize(new java.awt.Dimension(120, 35));
        generar3.setPreferredSize(new java.awt.Dimension(120, 35));
        generar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar3ActionPerformed(evt);
            }
        });
        jPanel1.add(generar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generar3ActionPerformed

    private void generar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generar1ActionPerformed

    private void generar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generar2ActionPerformed

    //MIS METODOS

    Globales globales = new Globales();
    private int id_paciente = 0;
    private String cedula_buscada = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generar;
    private javax.swing.JButton generar1;
    private javax.swing.JButton generar2;
    private javax.swing.JButton generar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
