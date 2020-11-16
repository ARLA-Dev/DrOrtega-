package Modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OperarConsulta {

    public boolean RegistrarConsulta(int id_paciente, String motivo, String diagnostico, String indicaciones, String recetario){
        int op = 0;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("INSERT INTO `dr_johnny`.`consultas` (`id_consulta`, `id_paciente`, "
            + "`fecha/hora`, `motivos`, `diagnostico`, `indicaciones`, `recetario`) "
            + "VALUES (NULL, '"+ id_paciente +"', NOW(), '"+ motivo +"', '"+ diagnostico +"', "
            + "'"+ indicaciones +"', '"+ recetario +"');"
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
}
