package Ventanas;

import Globales.Globales;
import Modelos.Modelo;
import Modelos.OperarPaciente;
import javax.swing.JOptionPane;

public class Pacientes extends javax.swing.JInternalFrame {

    public Pacientes() {
        initComponents();
        setSize(1000, 575);
        buscar.setEnabled(true);
        modificar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicial_telefono = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        a_familiares = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        a_personales = new javax.swing.JTextArea();
        ocupacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fijo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        movil = new javax.swing.JTextField();
        letra_cedula = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
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
        jLabel1.setText("REGISTRO DE PACIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setText("Antecedentes Familiares");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        inicial_telefono.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        inicial_telefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0424", "0414", "0412", "0426", "0416" }));
        inicial_telefono.setBorder(null);
        jPanel1.add(inicial_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 70, -1));

        a_familiares.setColumns(20);
        a_familiares.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        a_familiares.setLineWrap(true);
        a_familiares.setRows(5);
        a_familiares.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jScrollPane1.setViewportView(a_familiares);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 390, 200));

        a_personales.setColumns(20);
        a_personales.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        a_personales.setLineWrap(true);
        a_personales.setRows(5);
        a_personales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jScrollPane2.setViewportView(a_personales);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 390, 200));

        ocupacion.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        ocupacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        ocupacion.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 270, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setText("Cédula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

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
        jLabel4.setText("Teléfono Móvil");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        fijo.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        fijo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        fijo.setPreferredSize(new java.awt.Dimension(59, 26));
        fijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fijoKeyTyped(evt);
            }
        });
        jPanel1.add(fijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 270, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setText("Teléfono Fijo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setText("Antecedentes Personales");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel7.setText("Ocupación");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel8.setText("Apellidos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        nombre.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombre.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 270, -1));

        movil.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        movil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        movil.setPreferredSize(new java.awt.Dimension(59, 26));
        movil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movilActionPerformed(evt);
            }
        });
        movil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                movilKeyTyped(evt);
            }
        });
        jPanel1.add(movil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 190, -1));

        letra_cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        letra_cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedula.setBorder(null);
        jPanel1.add(letra_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel9.setText("Nombres");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        apellido.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        apellido.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel10.setText("Edad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        edad.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        edad.setPreferredSize(new java.awt.Dimension(59, 26));
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 270, -1));

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
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

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
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, -1, -1));

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
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 110, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Modelo modelo = new Modelo();
        modelo = null;
        String num_movil = "";

        if (cedula.getText().equals("") || nombre.getText().equals("") || apellido.getText().equals("") || edad.getText().equals("") || (movil.getText().equals("") && fijo.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "Alguno de los campos está vacío... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else if (!((cedula.getText().length() < 7 || movil.getText().length() != 7)||(cedula.getText().length() < 7 || fijo.getText().length() != 10))) {

            JOptionPane.showMessageDialog(null, "Faltan números en la cédula o los teléfonos", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else if (Integer.parseInt(edad.getText()) < 0 || Integer.parseInt(edad.getText()) > 150) {

            JOptionPane.showMessageDialog(null, "Edad no válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else {
            if (!cedula_buscada.equals(letra_cedula.getSelectedItem() + "" + cedula.getText())) {

                OperarPaciente OP = new OperarPaciente();
                if (!movil.getText().equals("")) {
                    num_movil = inicial_telefono.getSelectedItem() + "" + movil.getText();
                }

                OP.ModificarPacienteOtraCedula(id_paciente, letra_cedula.getSelectedItem() + "" + cedula.getText(), nombre.getText().toUpperCase(), apellido.getText().toUpperCase(), Integer.parseInt(edad.getText()), ocupacion.getText().toUpperCase(), num_movil, fijo.getText(), a_personales.getText().toUpperCase(), a_familiares.getText().toUpperCase());
                limpiarCampos();

            } else {
                if (!movil.getText().equals("")) {
                    num_movil = inicial_telefono.getSelectedItem() + "" + movil.getText();
                }

                OperarPaciente OP = new OperarPaciente();
                OP.ModificarPacienteMismaCedula(id_paciente, letra_cedula.getSelectedItem() + "" + cedula.getText(), nombre.getText().toUpperCase(), apellido.getText().toUpperCase(), Integer.parseInt(edad.getText()), ocupacion.getText().toUpperCase(), num_movil, fijo.getText(), a_personales.getText().toUpperCase(), a_familiares.getText().toUpperCase());
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        String num_movil = "";

        if (cedula.getText().equals("") || nombre.getText().equals("") || apellido.getText().equals("") || edad.getText().equals("") || (movil.getText().equals("") && fijo.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "¡Algún campo importante está vacío!", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else if (!((cedula.getText().length() < 7 || movil.getText().length() != 7)||(cedula.getText().length() < 7 || fijo.getText().length() != 10))) {

            JOptionPane.showMessageDialog(null, "Faltan números en la cédula o los teléfonos", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else if (Integer.parseInt(edad.getText()) < 0 || Integer.parseInt(edad.getText()) > 150) {

            JOptionPane.showMessageDialog(null, "Edad no válida", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {

            if (!movil.getText().equals("")) {
                num_movil = inicial_telefono.getSelectedItem() + "" + movil.getText();
            }

            OperarPaciente op = new OperarPaciente();
            op.RegistrarPaciente(letra_cedula.getSelectedItem() + "" + cedula.getText(), nombre.getText().toUpperCase(), apellido.getText().toUpperCase(), Integer.parseInt(edad.getText()), ocupacion.getText().toUpperCase(), num_movil, fijo.getText(), a_personales.getText().toUpperCase(), a_familiares.getText().toUpperCase());
            limpiarCampos();
        }
    }//GEN-LAST:event_registrarActionPerformed

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

    private void movilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_movilKeyTyped
        char c = evt.getKeyChar();
        globales.soloNumeros(c, evt);
        globales.validarLongitud(movil, 6, evt);
    }//GEN-LAST:event_movilKeyTyped

    private void fijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fijoKeyTyped
        char c = evt.getKeyChar();
        globales.soloNumeros(c, evt);
        globales.validarLongitud(fijo, 10, evt);
    }//GEN-LAST:event_fijoKeyTyped

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
                nombre.setText(modelo.getNombres());
                apellido.setText(modelo.getApellidos());
                edad.setText(modelo.getEdad() + "");
                ocupacion.setText(modelo.getOcupacion());
                fijo.setText(modelo.getFijo());
                a_personales.setText(modelo.getAp());
                a_familiares.setText(modelo.getAf());
                inicial_telefono.setSelectedItem(modelo.getMovil().substring(0, 4));
                movil.setText(modelo.getMovil().substring(4));
                modificar.setEnabled(true);
                buscar.setEnabled(false);
                cedula_buscada = letra_cedula.getSelectedItem() + "" + cedula.getText();
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void movilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movilActionPerformed

    //MIS METODOS
    public void limpiarCampos() {
        id_paciente = 0;
        cedula_buscada = "";
        cedula.setText("");
        apellido.setText("");
        nombre.setText("");
        edad.setText("");
        ocupacion.setText("");
        a_familiares.setText("");
        a_personales.setText("");
        fijo.setText("");
        movil.setText("");
        letra_cedula.setSelectedItem("V-");
        inicial_telefono.setSelectedItem("0424");
        buscar.setEnabled(true);
        modificar.setEnabled(false);
    }

    Globales globales = new Globales();
    private int id_paciente = 0;
    private String cedula_buscada = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a_familiares;
    private javax.swing.JTextArea a_personales;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField fijo;
    private javax.swing.JComboBox<String> inicial_telefono;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField movil;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField ocupacion;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
