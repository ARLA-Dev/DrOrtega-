package Principales;

import Globales.Globales;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(1024, 650);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent evt) {
                close();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clave = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dr. Johnny Ortega");
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1024, 650));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clave.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        clave.setToolTipText("Contraseña");
        clave.setBorder(null);
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 310, 40));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Dr. Johnny Ortega");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 260, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo-Circular.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_off.png"))); // NOI18N
        btn_entrar.setBorder(null);
        btn_entrar.setBorderPainted(false);
        btn_entrar.setContentAreaFilled(false);
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.setFocusPainted(false);
        btn_entrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton_on.png"))); // NOI18N
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 90, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceus.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 270, 480));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caduceus.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 480));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        JButton bt = (JButton) evt.getSource();

        if (bt == btn_entrar) {
            if (clave.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "    No ingresó una contraseña", "ERROR", JOptionPane.ERROR_MESSAGE);
                correcto = false;
            } else if (clave.getText().equals("ANTONIETA")) {
                
                correcto = true;
                
            } else {
                JOptionPane.showMessageDialog(null, "      Contraseña Incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                correcto = false;
            }
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    /*METODOS PERSONALES*/
    public void close() {

        Toolkit.getDefaultToolkit().beep();

        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "SALIDA DEL SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            System.exit(0);
        }
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public boolean getCorrecto() {
        return correcto;
    }

    private boolean correcto = false;
    private Globales globales = new Globales();
    private MDI mdi = new MDI();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JPasswordField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
