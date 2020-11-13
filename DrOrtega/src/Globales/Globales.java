package Globales;

import java.awt.Toolkit;
import javax.swing.JTextField;

public class Globales {

    public void soloNumeros(char c, java.awt.event.KeyEvent e) {
        if (!Character.isDigit(c)) {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }

    public void validarLongitud(JTextField tx, int longitud, java.awt.event.KeyEvent e) {

        if (tx.getText().length() > longitud) {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }
}
