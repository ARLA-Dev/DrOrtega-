package Ventanas;

public class Historias extends javax.swing.JInternalFrame {

    public Historias() {
        initComponents();
        setSize(1000,575);
        historia.getTableHeader().setReorderingAllowed(false);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        historia = new javax.swing.JTable();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreYApellido = new javax.swing.JTextField();

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

        num_historia.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        num_historia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        num_historia.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(num_historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 160, -1));

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

        historia.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
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
        historia.setColumnSelectionAllowed(true);
        historia.setEnabled(false);
        historia.setFocusable(false);
        historia.setRequestFocusEnabled(false);
        historia.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(historia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 980, 410));

        cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        cedula.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setText("Cédula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setText("Nombre y Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        nombreYApellido.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        nombreYApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombreYApellido.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(nombreYApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 240, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    
    //Mis Metodos
    
    private void limpiarCampos(){
        cedula.setText("");
        letra_cedula.setSelectedItem("V-");
        nombreYApellido.setText("");
        num_historia.setText("");
        historia.getModel();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTable historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombreYApellido;
    private javax.swing.JTextField num_historia;
    // End of variables declaration//GEN-END:variables
}
