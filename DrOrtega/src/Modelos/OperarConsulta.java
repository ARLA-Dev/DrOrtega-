package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarConsulta {

    public boolean RegistrarConsulta(int id_paciente, String motivo, String diagnostico, String indicaciones, String recetario) {
        int op = 0;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("INSERT INTO `dr_johnny`.`consultas` (`id_consulta`, `id_paciente`, "
                + "`fecha/hora`, `motivos`, `diagnostico`, `indicaciones`, `recetario`) "
                + "VALUES (NULL, '" + id_paciente + "', NOW(), '" + motivo + "', '" + diagnostico + "', "
                + "'" + indicaciones + "', '" + recetario + "');"
        );

        if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "¡Se ha Registrado la Consulta con Éxito!", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "No se ha podido registrar la Consulta... Intente de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        bd.desconectar();
        return correcto;
    }

    public ArrayList BuscarconMatriz(String cedula) {

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

                result = bd.consultar("SELECT * FROM pacientes, consultas WHERE pacientes.cedula = \"" + cedula + "\" AND consultas.id_paciente = pacientes.id_paciente");
                
                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setId_paciente(result.getInt("pacientes.id_paciente"));
                    iv.setNombres(result.getString("pacientes.nombre"));
                    iv.setApellidos(result.getString("pacientes.apellido"));
                    iv.setFecha(result.getString("consultas.fecha/hora"));
                    iv.setMotivo(result.getString("consultas.motivos"));
                    iv.setDiagnostico(result.getString("consultas.diagnostico"));
                    iv.setIndicaciones(result.getString("consultas.indicaciones"));
                    iv.setRecetario(result.getString("consultas.recetario"));
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
