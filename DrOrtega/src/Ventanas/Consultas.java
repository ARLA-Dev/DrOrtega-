package Ventanas;

import Globales.Globales;
import Modelos.Conexion;
import Modelos.DesplegableMedicamentos;
import Modelos.Modelo;
import Modelos.OperarConsulta;
import Modelos.OperarPaciente;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Consultas extends javax.swing.JInternalFrame {

    public Consultas() {
        initComponents();
        setSize(1000, 575);
        cargarCBMedicamentos();
        medicamento.setSelectedIndex(0);
        fecha.setText(metodos.fecha_al_dia());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        medicamento = new javax.swing.JComboBox<>();
        registrar = new javax.swing.JButton();
        Incluir_dosis = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        buscar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dosis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombreYApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        indicaciones = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        motivo = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        recetario = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        diagnostico = new javax.swing.JTextArea();
        letra_cedula = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Consultas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultaM.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRO DE CONSULTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel3.setText("Edad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        fecha.setEditable(false);
        fecha.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        fecha.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, -1));

        medicamento.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        medicamento.setBorder(null);
        medicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicamentoActionPerformed(evt);
            }
        });
        jPanel1.add(medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 160, -1));

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
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, -1, -1));

        Incluir_dosis.setBackground(new java.awt.Color(168, 95, 21));
        Incluir_dosis.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        Incluir_dosis.setForeground(new java.awt.Color(255, 255, 255));
        Incluir_dosis.setText("Añadir");
        Incluir_dosis.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 51, 0)));
        Incluir_dosis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Incluir_dosis.setFocusPainted(false);
        Incluir_dosis.setMaximumSize(new java.awt.Dimension(120, 35));
        Incluir_dosis.setMinimumSize(new java.awt.Dimension(120, 35));
        Incluir_dosis.setPreferredSize(new java.awt.Dimension(120, 35));
        Incluir_dosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Incluir_dosisActionPerformed(evt);
            }
        });
        jPanel1.add(Incluir_dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

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
        jPanel1.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        buscar1.setBorder(null);
        buscar1.setContentAreaFilled(false);
        buscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar1.setFocusPainted(false);
        buscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupaON.png"))); // NOI18N
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        jPanel1.add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, 40));

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setText("Recetario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        dosis.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        dosis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        dosis.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(dosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 250, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setText("Nombre y Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        nombreYApellido.setEditable(false);
        nombreYApellido.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        nombreYApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        nombreYApellido.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(nombreYApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 220, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setText("Cédula del Paciente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        edad.setEditable(false);
        edad.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        edad.setPreferredSize(new java.awt.Dimension(59, 26));
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, -1));

        indicaciones.setColumns(20);
        indicaciones.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        indicaciones.setLineWrap(true);
        indicaciones.setRows(5);
        jScrollPane3.setViewportView(indicaciones);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 260, 120));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel7.setText("Fecha");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel8.setText("Medicamento");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel9.setText("Diagnóstico");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        motivo.setColumns(20);
        motivo.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        motivo.setLineWrap(true);
        motivo.setRows(5);
        jScrollPane4.setViewportView(motivo);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 260, 120));

        recetario.setColumns(20);
        recetario.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        recetario.setLineWrap(true);
        recetario.setRows(5);
        jScrollPane5.setViewportView(recetario);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 430, 120));

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel10.setText("Indicaciones");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        diagnostico.setColumns(20);
        diagnostico.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        diagnostico.setLineWrap(true);
        diagnostico.setRows(5);
        jScrollPane6.setViewportView(diagnostico);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 260, 120));

        letra_cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        letra_cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-" }));
        letra_cedula.setBorder(null);
        jPanel1.add(letra_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel12.setText("Motivo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        cedula.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        cedula.setPreferredSize(new java.awt.Dimension(59, 26));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 160, -1));

        jLabel13.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        jLabel13.setText("Tlf: 0424-5147683");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, 140, -1));

        jLabel14.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel14.setText("Dosis");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Leelawadee", 1, 19)); // NOI18N
        jLabel15.setText("Dr Johnny Ortega");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void Incluir_dosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Incluir_dosisActionPerformed

        recetario.append(medicamento.getSelectedItem() + " " + dosis.getText() + " ->\n");
        medicamento.setSelectedItem(0);
        dosis.setText("");
    }//GEN-LAST:event_Incluir_dosisActionPerformed

    private void medicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicamentoActionPerformed


    }//GEN-LAST:event_medicamentoActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped

        char c = evt.getKeyChar();
        metodos.soloNumeros(c, evt);
        metodos.validarLongitud(cedula, 8, evt);
    }//GEN-LAST:event_cedulaKeyTyped

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed

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
                nombreYApellido.setText(modelo.getNombres() + " " + modelo.getApellidos());
                edad.setText(modelo.getEdad() + "");
            }
        }
    }//GEN-LAST:event_buscar1ActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        if (id_paciente == 0) {

            JOptionPane.showMessageDialog(null, "Aún no ha buscado un Paciente... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else if (recetario.getText().equals("") || motivo.getText().equals("") || diagnostico.getText().equals("") || indicaciones.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío... Intente de nuevo", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            OperarConsulta op = new OperarConsulta();
            op.RegistrarConsulta(id_paciente, motivo.getText().toUpperCase(), diagnostico.getText().toUpperCase(), indicaciones.getText().toUpperCase(), recetario.getText().toUpperCase());
            generar_recipe();            
            limpiarCampos();
        }
    }//GEN-LAST:event_registrarActionPerformed

    // Mis Métodos
    private void limpiarCampos() {
        cedula.setText("");
        nombreYApellido.setText("");
        edad.setText("");
        indicaciones.setText("");
        diagnostico.setText("");
        motivo.setText("");
        letra_cedula.setSelectedItem("V-");
        recetario.setText("");
        dosis.setText("");
        cargarCBMedicamentos();
        id_paciente = 0;
        medicamento.setSelectedIndex(0);
    }

    public void cargarCBMedicamentos() {

        medicamento.removeAllItems();
        DesplegableMedicamentos medicamentos = new DesplegableMedicamentos();
        listaM = medicamentos.DesplegableMedicamentos();

        for (int i = 0; i < listaM.size(); i++) {

            medicamento.addItem(listaM.get(i).getNombreMedicamento());
        }
    }

    public void generar_recipe() {

        try {
            Conexion con = new Conexion();
            Connection conn = con.getConexion();

            JasperReport reporte = null;
            String path = "src\\Plantillas\\Recipes.jasper";

            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);

            JasperViewer view = new JasperViewer(jprint, false);

            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            view.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    // Variables Personales
    private Globales metodos = new Globales();
    private int id_paciente = 0;
    ArrayList<Modelo> listaM;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Incluir_dosis;
    private javax.swing.JButton buscar1;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextArea diagnostico;
    private javax.swing.JTextField dosis;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextArea indicaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JButton limpiar;
    private javax.swing.JComboBox<String> medicamento;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextArea motivo;
    private javax.swing.JTextField nombreYApellido;
    private javax.swing.JTextArea recetario;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
