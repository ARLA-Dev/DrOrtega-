package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarMedicamento {

    private Modelo modelo = null;

    public boolean RegistrarMedicamento(String nombre, String indicaciones) {
        int op = 0;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        BDConex bd = new BDConex();
        boolean correcto = false;

        rs = bd.consultar("SELECT * FROM `medicamentos` WHERE `nombre_m` = \"" + nombre + "\" AND borrado=0 AND `indicaciones` = '" + indicaciones + "';");

        try {
            if (rs.first()) {

                JOptionPane.showMessageDialog(null, "¡El medicamento ya está Registrado!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                op = bd.ejecutar("INSERT INTO `medicamentos` (`id_medicamento`, `nombre_m`,`indicaciones`, `borrado`) VALUES (NULL, '" + nombre + "','"+indicaciones+"', '0');");

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

    public boolean modificar(int id, String nombre, String indicaciones) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        ResultSet rs = null;

        rs = bd.consultar("SELECT * FROM `medicamentos` WHERE `nombre_m` = \"" + nombre + "\" AND borrado=0 AND `indicaciones` = '" + indicaciones + "';");

        try {
            if (rs.first()) {

                JOptionPane.showMessageDialog(null, "¡El nombre del médicamento ya está registrado!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                op = bd.ejecutar("UPDATE `medicamentos` SET `nombre_m` = '" + nombre + "', `indicaciones` = '" + indicaciones + "' WHERE `id_medicamento` ='" + id + "' AND `borrado`= '0';");

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
    
    public ArrayList BuscarconMatriz() {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `medicamentos` WHERE `borrado`=0");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombreMedicamento(result.getString("nombre_m"));
                    iv.setIndicacionMedicamento(result.getString("indicaciones"));
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }

}
