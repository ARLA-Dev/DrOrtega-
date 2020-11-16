package Ventanas;

import Modelos.DesplegableMedicamentos;
import Modelos.Modelo;
import Modelos.OperarMedicamento;
import Modelos.OperarPaciente;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Medicamentos extends javax.swing.JInternalFrame {

    public Medicamentos() {
        initComponents();
        setSize(1000, 575);
        oculto.setVisible(false);
        cargarCBMedicamentos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oculto = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        buscado = new javax.swing.JComboBox<>();
        nombreM = new javax.swing.JTextField();
        medicamento_buscado = new javax.swing.JTextField();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Medicamentos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicinas.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE MEDICAMENTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setText("Nombre del Medicamento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        oculto.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        oculto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        oculto.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(oculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 10, -1));

        registrar.setBackground(new java.awt.Color(168, 95, 21));
        registrar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.setFocusPainted(false);
        registrar.setMaximumSize(new java.awt.Dimension(120, 35));
        registrar.setMinimumSize(new java.awt.Dimension(120, 35));
        registrar.setPreferredSize(new java.awt.Dimension(120, 35));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 30));

        modificar.setBackground(new java.awt.Color(168, 95, 21));
        modificar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("MODIFICAR");
        modificar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setFocusPainted(false);
        modificar.setMaximumSize(new java.awt.Dimension(120, 35));
        modificar.setMinimumSize(new java.awt.Dimension(120, 35));
        modificar.setPreferredSize(new java.awt.Dimension(120, 35));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        limpiar.setBackground(new java.awt.Color(168, 95, 21));
        limpiar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR");
        limpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFocusPainted(false);
        limpiar.setMaximumSize(new java.awt.Dimension(120, 35));
        limpiar.setMinimumSize(new java.awt.Dimension(120, 35));
        limpiar.setPreferredSize(new java.awt.Dimension(120, 35));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setText("Búsqueda Medicamento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        borrar.setBackground(new java.awt.Color(168, 95, 21));
        borrar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("BORRAR");
        borrar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.setFocusPainted(false);
        borrar.setMaximumSize(new java.awt.Dimension(120, 35));
        borrar.setMinimumSize(new java.awt.Dimension(120, 35));
        borrar.setPreferredSize(new java.awt.Dimension(120, 35));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 120, -1));

        buscado.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        buscado.setBorder(null);
        buscado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                buscadoItemStateChanged(evt);
            }
        });
        jPanel1.add(buscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 300, 30));

        nombreM.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        nombreM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombreM.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(nombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 300, 30));

        medicamento_buscado.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        medicamento_buscado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        medicamento_buscado.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(medicamento_buscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 300, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (medicamento_buscado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacío... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            OperarMedicamento OP = new OperarMedicamento();
            OP.modificar(Integer.parseInt(oculto.getText()), medicamento_buscado.getText().toUpperCase());
            cargarCBMedicamentos();
            limpiarCampos();
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        OperarMedicamento OP = new OperarMedicamento();
        OP.borrar(Integer.parseInt(oculto.getText()));
        cargarCBMedicamentos();
        limpiarCampos();
    }//GEN-LAST:event_borrarActionPerformed

    private void buscadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_buscadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            oculto.setText(listaM.get(buscado.getSelectedIndex()).getId_medicamento() + "");
            medicamento_buscado.setText(buscado.getSelectedItem() + "");
        }
    }//GEN-LAST:event_buscadoItemStateChanged

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (nombreM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo vacío... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            OperarMedicamento OP = new OperarMedicamento();
            OP.RegistrarMedicamento(nombreM.getText().toUpperCase());
            cargarCBMedicamentos();
            limpiarCampos();
        }
    }//GEN-LAST:event_registrarActionPerformed

   //METODOS PERSONALES
    
    private void limpiarCampos() {
        buscado.setSelectedIndex(0);
        oculto.setText("0");
        nombreM.setText("");
        medicamento_buscado.setText(buscado.getSelectedItem() + "");

    }

    public void cargarCBMedicamentos() {

        buscado.removeAllItems();
        DesplegableMedicamentos medicamentos = new DesplegableMedicamentos();
        listaM = medicamentos.DesplegableMedicamentos();

        for (int i = 0; i < listaM.size(); i++) {

            buscado.addItem(listaM.get(i).getNombreMedicamento());
            oculto.setText(listaM.get(i).getId_medicamento() + "");
        }
        oculto.setText(listaM.get(0).getId_medicamento() + "");
    }

    ArrayList< Modelo> listaM;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JComboBox<String> buscado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField medicamento_buscado;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombreM;
    private javax.swing.JTextField oculto;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
