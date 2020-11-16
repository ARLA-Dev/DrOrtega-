package Globales;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public String fecha_al_dia() {

        String pattern = "dd/MM/yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String t = sdf.format(new Date());
        return t;
    }
}
