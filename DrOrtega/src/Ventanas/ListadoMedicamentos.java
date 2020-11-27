package Ventanas;

import Globales.WordWrapRenderer;
import Modelos.OperarMedicamento;
import java.util.ArrayList;
import Modelos.Modelo;
import javax.swing.table.DefaultTableModel;

public class ListadoMedicamentos extends javax.swing.JInternalFrame {

    public ListadoMedicamentos() {
        initComponents();
        setSize(1000, 575);
        listado.getTableHeader().setReorderingAllowed(false);
        obtenerMatriz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Listado de Medicamentos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicinas.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setText("LISTADO DE MEDICAMENTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        listado.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre del Medicamento", "Indicación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listado.setColumnSelectionAllowed(true);
        listado.setEnabled(false);
        listado.setFocusable(false);
        listado.setRequestFocusEnabled(false);
        listado.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(listado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 460));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Métodos Personales
    public void obtenerMatriz() {

        OperarMedicamento op = new OperarMedicamento();
        ArrayList<Modelo> miLista = op.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) listado.getModel();
        listado.getColumnModel().getColumn(0).setCellRenderer(new WordWrapRenderer());
        listado.getColumnModel().getColumn(1).setCellRenderer(new WordWrapRenderer());

        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombreMedicamento(), miLista.get(i).getIndicacionMedicamento()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado;
    // End of variables declaration//GEN-END:variables
}
