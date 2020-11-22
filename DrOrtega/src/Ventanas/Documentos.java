package Ventanas;

import Globales.Globales;
import Modelos.Conexion;
import Modelos.Modelo;
import Modelos.OperarPaciente;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

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
        constancia = new javax.swing.JButton();
        orden = new javax.swing.JButton();
        reposo = new javax.swing.JButton();
        informe = new javax.swing.JButton();
        referencia = new javax.swing.JButton();
        recipe = new javax.swing.JButton();

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

        constancia.setBackground(new java.awt.Color(168, 95, 21));
        constancia.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        constancia.setForeground(new java.awt.Color(255, 255, 255));
        constancia.setText("CONSTANCIA");
        constancia.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        constancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        constancia.setFocusPainted(false);
        constancia.setMaximumSize(new java.awt.Dimension(120, 35));
        constancia.setMinimumSize(new java.awt.Dimension(120, 35));
        constancia.setPreferredSize(new java.awt.Dimension(120, 35));
        constancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constanciaActionPerformed(evt);
            }
        });
        jPanel1.add(constancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 130, -1));

        orden.setBackground(new java.awt.Color(168, 95, 21));
        orden.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        orden.setForeground(new java.awt.Color(255, 255, 255));
        orden.setText("ORDEN");
        orden.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        orden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orden.setFocusPainted(false);
        orden.setMaximumSize(new java.awt.Dimension(120, 35));
        orden.setMinimumSize(new java.awt.Dimension(120, 35));
        orden.setPreferredSize(new java.awt.Dimension(120, 35));
        orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenActionPerformed(evt);
            }
        });
        jPanel1.add(orden, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 130, -1));

        reposo.setBackground(new java.awt.Color(168, 95, 21));
        reposo.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        reposo.setForeground(new java.awt.Color(255, 255, 255));
        reposo.setText("REPOSO");
        reposo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        reposo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reposo.setFocusPainted(false);
        reposo.setMaximumSize(new java.awt.Dimension(120, 35));
        reposo.setMinimumSize(new java.awt.Dimension(120, 35));
        reposo.setPreferredSize(new java.awt.Dimension(120, 35));
        reposo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reposoActionPerformed(evt);
            }
        });
        jPanel1.add(reposo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 130, -1));

        informe.setBackground(new java.awt.Color(168, 95, 21));
        informe.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        informe.setForeground(new java.awt.Color(255, 255, 255));
        informe.setText("INFORME");
        informe.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        informe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informe.setFocusPainted(false);
        informe.setMaximumSize(new java.awt.Dimension(120, 35));
        informe.setMinimumSize(new java.awt.Dimension(120, 35));
        informe.setPreferredSize(new java.awt.Dimension(120, 35));
        informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informeActionPerformed(evt);
            }
        });
        jPanel1.add(informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 130, -1));

        referencia.setBackground(new java.awt.Color(168, 95, 21));
        referencia.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        referencia.setForeground(new java.awt.Color(255, 255, 255));
        referencia.setText("REFERENCIA");
        referencia.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        referencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        referencia.setFocusPainted(false);
        referencia.setMaximumSize(new java.awt.Dimension(120, 35));
        referencia.setMinimumSize(new java.awt.Dimension(120, 35));
        referencia.setPreferredSize(new java.awt.Dimension(120, 35));
        referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaActionPerformed(evt);
            }
        });
        jPanel1.add(referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 130, -1));

        recipe.setBackground(new java.awt.Color(168, 95, 21));
        recipe.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        recipe.setForeground(new java.awt.Color(255, 255, 255));
        recipe.setText("RÉCIPE");
        recipe.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        recipe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recipe.setFocusPainted(false);
        recipe.setMaximumSize(new java.awt.Dimension(120, 35));
        recipe.setMinimumSize(new java.awt.Dimension(120, 35));
        recipe.setPreferredSize(new java.awt.Dimension(120, 35));
        recipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeActionPerformed(evt);
            }
        });
        jPanel1.add(recipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 130, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informeActionPerformed
       
        generar_documento("informe");
        
    }//GEN-LAST:event_informeActionPerformed

    private void constanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constanciaActionPerformed
        
        generar_documento("Constancia");
        
    }//GEN-LAST:event_constanciaActionPerformed

    private void reposoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reposoActionPerformed
       
        generar_documento("reposo");
        
    }//GEN-LAST:event_reposoActionPerformed

    private void referenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaActionPerformed
        
        generar_documento("Referencia");
        
    }//GEN-LAST:event_referenciaActionPerformed

    private void recipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeActionPerformed
        
        generar_documento("Recipes_en_blanco");
        
    }//GEN-LAST:event_recipeActionPerformed

    private void ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenActionPerformed
        
        generar_documento("Orden_Medica");
        
    }//GEN-LAST:event_ordenActionPerformed

    //MIS METODOS
    
    public void generar_documento(String plantilla) {

        try {
            Conexion con = new Conexion();
            Connection conn = con.getConexion();

            JasperReport reporte = null;
            String path = "src\\Plantillas\\"+ plantilla +".jasper";

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);

            JasperViewer view = new JasperViewer(jprint, false);

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    Globales globales = new Globales();
    private int id_paciente = 0;
    private String cedula_buscada = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton constancia;
    private javax.swing.JButton informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orden;
    private javax.swing.JButton recipe;
    private javax.swing.JButton referencia;
    private javax.swing.JButton reposo;
    // End of variables declaration//GEN-END:variables
}
