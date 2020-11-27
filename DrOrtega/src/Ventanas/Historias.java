package Ventanas;

import Globales.Globales;
import Globales.WordWrapRenderer;
import Modelos.Modelo;
import Modelos.OperarConsulta;
import Modelos.OperarPaciente;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Historias extends javax.swing.JInternalFrame {

    public Historias() {
        initComponents();
        setSize(1000, 575);
        historia.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel model = (DefaultTableModel) historia.getModel();
        historia.getColumnModel().getColumn(0).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(1).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(2).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(3).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(4).setCellRenderer(new WordWrapRenderer());
        model.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num_historia = new javax.swing.JTextField();
        letra_cedula = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreYApellido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        historia = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Historias");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setText("HISTORIA DEL PACIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setText("N° de Historia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        num_historia.setEditable(false);
        num_historia.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        num_historia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        num_historia.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(num_historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 170, -1));

        letra_cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        letra_cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedula.setBorder(null);
        jPanel1.add(letra_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, -1));

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
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 50, 40));

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
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 110, -1));

        cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        cedula.setPreferredSize(new java.awt.Dimension(59, 26));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setText("Cédula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setText("Nombre y Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        nombreYApellido.setEditable(false);
        nombreYApellido.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        nombreYApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombreYApellido.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(nombreYApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 240, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(375, 64));

        historia.setFont(new java.awt.Font("Leelawadee", 1, 10)); // NOI18N
        historia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Motivo", "Diagnóstico", "Indicaciones", "Recetario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historia.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        historia.setColumnSelectionAllowed(true);
        historia.setEnabled(false);
        historia.setFocusable(false);
        historia.setPreferredSize(new java.awt.Dimension(980, 410));
        historia.setRequestFocusEnabled(false);
        historia.setRowHeight(60);
        historia.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(historia);
        historia.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (historia.getColumnModel().getColumnCount() > 0) {
            historia.getColumnModel().getColumn(0).setResizable(false);
            historia.getColumnModel().getColumn(1).setResizable(false);
            historia.getColumnModel().getColumn(2).setResizable(false);
            historia.getColumnModel().getColumn(3).setResizable(false);
            historia.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 980, 410));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped

        char c = evt.getKeyChar();
        metodos.soloNumeros(c, evt);
        metodos.validarLongitud(cedula, 8, evt);
    }//GEN-LAST:event_cedulaKeyTyped

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        if (cedula.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "El campo está vacío... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            obtenerMatriz();
        }
    }//GEN-LAST:event_buscarActionPerformed

    //Mis Metodos
    public void obtenerMatriz() {

        OperarConsulta op = new OperarConsulta();
        ArrayList<Modelo> miLista = op.BuscarconMatriz(letra_cedula.getSelectedItem() + "" + cedula.getText());
        DefaultTableModel model = (DefaultTableModel) historia.getModel();
        historia.getColumnModel().getColumn(0).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(1).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(2).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(3).setCellRenderer(new WordWrapRenderer());
        historia.getColumnModel().getColumn(4).setCellRenderer(new WordWrapRenderer());
        model.setRowCount(0);

        if (miLista.size() > 0) {

            for (int i = 0; i < miLista.size(); i++) {

                nombreYApellido.setText(miLista.get(i).getNombres() + " " + miLista.get(i).getApellidos());
                num_historia.setText(miLista.get(i).getId_paciente() + "");

                model.addRow(new Object[]{miLista.get(i).getFecha(), miLista.get(i).getMotivo(), miLista.get(i).getDiagnostico(), miLista.get(i).getIndicaciones(), miLista.get(i).getRecetario()});
                
            }
        }
    }

    private void limpiarCampos() {
        cedula.setText("");
        letra_cedula.setSelectedItem("V-");
        nombreYApellido.setText("");
        num_historia.setText("");
        DefaultTableModel model = (DefaultTableModel) historia.getModel();
        model.setRowCount(0);
    }
    


    Globales metodos = new Globales();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTable historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombreYApellido;
    private javax.swing.JTextField num_historia;
    // End of variables declaration//GEN-END:variables
}
