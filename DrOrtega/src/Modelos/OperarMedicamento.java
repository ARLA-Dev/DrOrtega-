package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OperarMedicamento {

    private Modelo modelo = null;

    public boolean RegistrarMedicamento(String nombre) {
        int op = 0;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        BDConex bd = new BDConex();
        boolean correcto = false;

        rs = bd.consultar("SELECT * FROM `medicamentos` WHERE `nombre_m` = \"" + nombre + "\" AND borrado=0");

        try {
            if (rs.first()) {

                JOptionPane.showMessageDialog(null, "¡El medicamento ya está Registrado!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                op = bd.ejecutar("INSERT INTO `medicamentos` (`id_medicamento`, `nombre_m`, `borrado`) VALUES (NULL, '" + nombre + "', '0');");

                if (op > 0) {

                    correcto = true;
                    JOptionPane.showMessageDialog(null, "¡Se ha Registrado al medicamento con Éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido registrar el medicamento... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        bd.desconectar();
        return correcto;
    }

    public boolean borrar(int id) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE `medicamentos` SET `borrado` = '1' WHERE `id_medicamento` ='" + id + "' AND `borrado`= '0';");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "¡Se ha borrado el medicamento con éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "No se ha podido borrar el medicamento... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(int id, String nombre) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        ResultSet rs = null;

        rs = bd.consultar("SELECT * FROM `medicamentos` WHERE `nombre_m` = \"" + nombre + "\" AND borrado=0");

        try {
            if (rs.first()) {

                JOptionPane.showMessageDialog(null, "¡El nombre del médicamento ya está registrado!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                op = bd.ejecutar("UPDATE `medicamentos` SET `nombre_m` = '" + nombre + "' WHERE `id_medicamento` ='" + id + "' AND `borrado`= '0';");

                if (op > 0) {
                    correcto = true;
                    JOptionPane.showMessageDialog(null, "¡Se ha modificado el medicamento con éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido modificar el medicamento... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        bd.desconectar();
        return correcto;
    }

}
