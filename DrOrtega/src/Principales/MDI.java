package Principales;

import Globales.Globales;
import Ventanas.Consultas;
import Ventanas.Historias;
import Ventanas.ListadoMedicamentos;
import Ventanas.ListadoPacientes;
import Ventanas.Medicamentos;
import Ventanas.Pacientes;
import Ventanas.Documentos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class MDI extends javax.swing.JFrame {

    public MDI() {
        initComponents();
        setSize(1024, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent evt) {
                close();
            }
        });
        desktopPane.add(pacientes);
        desktopPane.add(medicamentos);
        desktopPane.add(consultas);
        desktopPane.add(historias);
        desktopPane.add(listado_m);
        desktopPane.add(listado_p);
        desktopPane.add(reposo_m);
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("h:mm:ss a");
        reloj.setText(formateador.format(LocalDateTime.now()));
        reloj();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        reloj = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        m_pacientes = new javax.swing.JMenu();
        i_pacientes = new javax.swing.JMenuItem();
        m_medicamentos = new javax.swing.JMenu();
        i_medicamentos = new javax.swing.JMenuItem();
        m_consulta = new javax.swing.JMenu();
        i_consulta = new javax.swing.JMenuItem();
        m_historias = new javax.swing.JMenu();
        i_historias = new javax.swing.JMenuItem();
        m_listados = new javax.swing.JMenu();
        i_lpacientes = new javax.swing.JMenuItem();
        i_lmedicamentos = new javax.swing.JMenuItem();
        Reposos = new javax.swing.JMenu();
        documentos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dr. Johnny Ortega");

        desktopPane.setBackground(new java.awt.Color(0, 102, 102));

        reloj.setFont(new java.awt.Font("Leelawadee", 3, 65)); // NOI18N
        reloj.setForeground(new java.awt.Color(255, 255, 255));
        reloj.setText("HH:MM:SS");

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/johnny.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ortegajohnny@hotmail.com");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dr. Johnny Ortega");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tlf: 0424-5147683");

        desktopPane.setLayer(reloj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel11))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel3))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel4))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(reloj)
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel4))
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        m_pacientes.setBackground(new java.awt.Color(255, 255, 255));
        m_pacientes.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        m_pacientes.setMnemonic('f');
        m_pacientes.setText("Pacientes");
        m_pacientes.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        i_pacientes.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        i_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        i_pacientes.setMnemonic('o');
        i_pacientes.setText("Pacientes");
        i_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_pacientesActionPerformed(evt);
            }
        });
        m_pacientes.add(i_pacientes);

        menuBar.add(m_pacientes);

        m_medicamentos.setBackground(new java.awt.Color(255, 255, 255));
        m_medicamentos.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        m_medicamentos.setMnemonic('e');
        m_medicamentos.setText("Medicamentos");
        m_medicamentos.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        i_medicamentos.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        i_medicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicinas.png"))); // NOI18N
        i_medicamentos.setMnemonic('t');
        i_medicamentos.setText("Medicamentos");
        i_medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_medicamentosActionPerformed(evt);
            }
        });
        m_medicamentos.add(i_medicamentos);

        menuBar.add(m_medicamentos);

        m_consulta.setBackground(new java.awt.Color(255, 255, 255));
        m_consulta.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        m_consulta.setMnemonic('h');
        m_consulta.setText("Consulta");
        m_consulta.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        i_consulta.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        i_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultaM.png"))); // NOI18N
        i_consulta.setMnemonic('c');
        i_consulta.setText("Consulta");
        i_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_consultaActionPerformed(evt);
            }
        });
        m_consulta.add(i_consulta);

        menuBar.add(m_consulta);

        m_historias.setBackground(new java.awt.Color(255, 255, 255));
        m_historias.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        m_historias.setMnemonic('h');
        m_historias.setText("Historias");
        m_historias.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        i_historias.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        i_historias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historia.png"))); // NOI18N
        i_historias.setMnemonic('c');
        i_historias.setText("Historias");
        i_historias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_historiasActionPerformed(evt);
            }
        });
        m_historias.add(i_historias);

        menuBar.add(m_historias);

        m_listados.setBackground(new java.awt.Color(255, 255, 255));
        m_listados.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        m_listados.setMnemonic('h');
        m_listados.setText("Listados");
        m_listados.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        i_lpacientes.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        i_lpacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        i_lpacientes.setMnemonic('c');
        i_lpacientes.setText("Pacientes");
        i_lpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_lpacientesActionPerformed(evt);
            }
        });
        m_listados.add(i_lpacientes);

        i_lmedicamentos.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        i_lmedicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medicinas.png"))); // NOI18N
        i_lmedicamentos.setMnemonic('c');
        i_lmedicamentos.setText("Medicamentos");
        i_lmedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_lmedicamentosActionPerformed(evt);
            }
        });
        m_listados.add(i_lmedicamentos);

        menuBar.add(m_listados);

        Reposos.setBackground(new java.awt.Color(255, 255, 255));
        Reposos.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
        Reposos.setMnemonic('h');
        Reposos.setText("Documentos");
        Reposos.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N

        documentos.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        documentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documento.png"))); // NOI18N
        documentos.setMnemonic('c');
        documentos.setText("Generar Documentos");
        documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentosActionPerformed(evt);
            }
        });
        Reposos.add(documentos);

        menuBar.add(Reposos);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void i_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_pacientesActionPerformed
        pacientes.setVisible(true);
    }//GEN-LAST:event_i_pacientesActionPerformed

    private void i_medicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_medicamentosActionPerformed
        medicamentos.setVisible(true);
    }//GEN-LAST:event_i_medicamentosActionPerformed

    private void i_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_consultaActionPerformed
        consultas.setVisible(true);
    }//GEN-LAST:event_i_consultaActionPerformed

    private void i_historiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_historiasActionPerformed
        historias.setVisible(true);
    }//GEN-LAST:event_i_historiasActionPerformed

    private void i_lpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_lpacientesActionPerformed
        listado_p.setVisible(true);
        listado_p.obtenerMatriz();
    }//GEN-LAST:event_i_lpacientesActionPerformed

    private void i_lmedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_lmedicamentosActionPerformed
        listado_m.setVisible(true);
        listado_m.obtenerMatriz();
    }//GEN-LAST:event_i_lmedicamentosActionPerformed

    private void documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentosActionPerformed
       reposo_m.setVisible(true);
    }//GEN-LAST:event_documentosActionPerformed

    //MIS METODOS
    public void close() {

        Toolkit.getDefaultToolkit().beep();

        if (JOptionPane.showConfirmDialog(null, "¿Desea volver al Login?", "SALIDA DEL SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            abierto = false;
        }
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public boolean getAbierto() {
        return abierto;
    }

    public void reloj() {
        
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("h:mm:ss a");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        reloj.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
        
    }

    private Globales globales = new Globales();
    private boolean abierto = false;
    private Pacientes pacientes = new Pacientes();
    private Medicamentos medicamentos = new Medicamentos();
    private Consultas consultas = new Consultas();
    private Historias historias = new Historias();
    private ListadoPacientes listado_p = new ListadoPacientes();
    private ListadoMedicamentos listado_m = new ListadoMedicamentos();
    private Documentos reposo_m = new Documentos();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Reposos;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem documentos;
    private javax.swing.JMenuItem i_consulta;
    private javax.swing.JMenuItem i_historias;
    private javax.swing.JMenuItem i_lmedicamentos;
    private javax.swing.JMenuItem i_lpacientes;
    private javax.swing.JMenuItem i_medicamentos;
    private javax.swing.JMenuItem i_pacientes;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu m_consulta;
    private javax.swing.JMenu m_historias;
    private javax.swing.JMenu m_listados;
    private javax.swing.JMenu m_medicamentos;
    private javax.swing.JMenu m_pacientes;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel reloj;
    // End of variables declaration//GEN-END:variables

}
