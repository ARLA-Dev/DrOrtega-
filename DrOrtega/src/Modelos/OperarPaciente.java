package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class OperarPaciente {

    private Modelo modelo = null;

    public boolean RegistrarPaciente(String cedula, String nombre, String apellido, int edad, String ocupacion, String movil, String fijo, String ap, String af) {
        int op = 0;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        BDConex bd = new BDConex();
        boolean correcto = false;

        rs = bd.consultar("SELECT * FROM `pacientes` WHERE `cedula` = \"" + cedula + "\"");

        try {
            if (rs.first()) {

                JOptionPane.showMessageDialog(null, "¡El Paciente ya está Registrado!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                op = bd.ejecutar("INSERT INTO `dr_johnny`.`pacientes` (`id_paciente`, `cedula`, `nombre`, `apellido`, `edad`, `ocupacion`, `telefono_fijo`, `telefono_movil`, `antecedentes_f`, `antecedentes_p`) VALUES (NULL, '" + cedula + "', '" + nombre + "', '" + apellido + "', " + edad + ", '" + ocupacion + "', '" + fijo + "', '" + movil + "', '" + af + "', '" + ap + "');");

                if (op > 0) {

                    correcto = true;
                    JOptionPane.showMessageDialog(null, "¡Se ha Registrado al Paciente con Éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido registrar el paciente... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        bd.desconectar();
        return correcto;
    }

    public Modelo BuscarPaciente(String cedula) {

        this.modelo = modelo;
        ResultSet rs = null;

        Modelo modelo = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM pacientes WHERE cedula='" + cedula + "';");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                modelo.setId_paciente(rs.getInt("id_paciente"));
                modelo.setNombres(rs.getString("nombre"));
                modelo.setApellidos(rs.getString("apellido"));
                modelo.setEdad(rs.getInt("edad"));
                modelo.setOcupacion(rs.getString("ocupacion"));
                modelo.setFijo(rs.getString("telefono_fijo"));
                modelo.setMovil(rs.getString("telefono_movil"));
                modelo.setAp(rs.getString("antecedentes_p"));
                modelo.setAf(rs.getString("antecedentes_f"));
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no está registrado... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
                modelo = null;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return modelo;
    }

    public boolean ModificarPacienteMismaCedula(int id, String cedula, String nombre, String apellido, int edad, String ocupacion, String movil, String fijo, String ap, String af) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        ResultSet rs = null;

        op = bd.ejecutar("UPDATE pacientes SET nombre=\"" + nombre + "\",apellido=\"" + apellido
                + "\",cedula=\"" + cedula + "\",edad=\"" + edad + "\",ocupacion=\"" + ocupacion + "\",telefono_fijo=\"" + fijo
                + "\",telefono_movil=\"" + movil + "\",antecedentes_f=\"" + af + "\",antecedentes_p=\"" + ap + "\" WHERE id_paciente = " + id + "");

        if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "¡Se ha Modificado al Paciente con Éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        bd.desconectar();
        return correcto;
    }

    public boolean ModificarPacienteOtraCedula(int id, String cedula, String nombre, String apellido, int edad, String ocupacion, String movil, String fijo, String ap, String af) {
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        ResultSet rs = null;

        rs = bd.consultar("SELECT * FROM `pacientes` WHERE `cedula` = \"" + cedula + "\"");

        try {
            if (rs.first()) {

                JOptionPane.showMessageDialog(null, "¡Esta cédula ya está registrada!", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                op = bd.ejecutar("UPDATE pacientes SET nombre=\"" + nombre + "\",apellido=\"" + apellido
                        + "\",cedula=\"" + cedula + "\",edad=\"" + edad + "\",ocupacion=\"" + ocupacion + "\",telefono_fijo=\"" + fijo
                        + "\",telefono_movil=\"" + movil + "\",antecedentes_f=\"" + af + "\",antecedentes_p=\"" + ap + "\" WHERE id_paciente = " + id + "");

                if (op > 0) {

                    correcto = true;
                    JOptionPane.showMessageDialog(null, "¡Se ha Modificado al Paciente con Éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null, "No se ha podido modificar el paciente... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);

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

                result = bd.consultar("SELECT * FROM `pacientes`");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setId_paciente(result.getInt("id_paciente"));
                    iv.setNombres(result.getString("nombre"));
                    iv.setApellidos(result.getString("apellido"));
                    iv.setCedula(result.getString("cedula"));
                    iv.setEdad(result.getInt("edad"));
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
