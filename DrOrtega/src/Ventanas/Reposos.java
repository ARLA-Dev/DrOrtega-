package Ventanas;

import Globales.Globales;
import Modelos.Modelo;
import Modelos.OperarPaciente;
import javax.swing.JOptionPane;

public class Reposos extends javax.swing.JInternalFrame {

    public Reposos() {
        initComponents();
        setSize(1000, 575);       
        buscar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        motivo = new javax.swing.JTextArea();
        duracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre_y_apellido = new javax.swing.JTextField();
        letra_cedula = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Pacientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setText("REPOSOS DE PACIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        motivo.setColumns(20);
        motivo.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        motivo.setLineWrap(true);
        motivo.setRows(5);
        motivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jScrollPane2.setViewportView(motivo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 390, 200));

        duracion.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        duracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        duracion.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 270, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setText("Cédula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        cedula.setPreferredSize(new java.awt.Dimension(59, 26));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setText("Motivo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel7.setText("Duración");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        nombre_y_apellido.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        nombre_y_apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombre_y_apellido.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(nombre_y_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 270, -1));

        letra_cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        letra_cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedula.setBorder(null);
        jPanel1.add(letra_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 50, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel9.setText("Nombre y Apellido");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel10.setText("Edad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        edad.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        edad.setPreferredSize(new java.awt.Dimension(59, 26));
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 270, -1));

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscar.setBorder(null);
        buscar.setContentAreaFilled(false);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.setFocusPainted(false);
        buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupaON.png"))); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 50, 40));

        generar.setBackground(new java.awt.Color(168, 95, 21));
        generar.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        generar.setForeground(new java.awt.Color(255, 255, 255));
        generar.setText("GENERAR");
        generar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generar.setFocusPainted(false);
        generar.setMaximumSize(new java.awt.Dimension(120, 35));
        generar.setMinimumSize(new java.awt.Dimension(120, 35));
        generar.setPreferredSize(new java.awt.Dimension(120, 35));
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel1.add(generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

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
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 120, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed

    }//GEN-LAST:event_generarActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char c = evt.getKeyChar();
        globales.soloNumeros(c, evt);
        globales.validarLongitud(cedula, 8, evt);
    }//GEN-LAST:event_cedulaKeyTyped

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        char c = evt.getKeyChar();
        globales.soloNumeros(c, evt);
        globales.validarLongitud(edad, 2, evt);
    }//GEN-LAST:event_edadKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        id_paciente = 0;

        if (cedula.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "El campo está vacío... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {
            Modelo modelo = new Modelo();
            modelo = null;
            OperarPaciente OP = new OperarPaciente();
            modelo = OP.BuscarPaciente(letra_cedula.getSelectedItem() + "" + cedula.getText());

            if (modelo != null) {

                id_paciente = modelo.getId_paciente();
                nombre_y_apellido.setText(modelo.getNombres());                
                edad.setText(modelo.getEdad() + "");
                duracion.setText(modelo.getDireccion());                
                motivo.setText(modelo.getAp());
                buscar.setEnabled(false);
                cedula_buscada = letra_cedula.getSelectedItem() + "" + cedula.getText();
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    //MIS METODOS
    private void limpiarCampos() {
       
        cedula.setText("");
        letra_cedula.setSelectedIndex(0);
        nombre_y_apellido.setText("");
        edad.setText("");
        motivo.setText("");
        duracion.setText("");
    }

    Globales globales = new Globales();
    private int id_paciente = 0;
    private String cedula_buscada = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField duracion;
    private javax.swing.JTextField edad;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextArea motivo;
    private javax.swing.JTextField nombre_y_apellido;
    // End of variables declaration//GEN-END:variables
}
