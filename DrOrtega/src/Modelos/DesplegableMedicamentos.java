package Modelos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DesplegableMedicamentos {
    public ArrayList DesplegableMedicamentos() {
		  
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
		   
		    while(result.next()== true){
                        iv = new Modelo();
                        iv.setId_medicamento(Integer.parseInt(result.getString("id_medicamento")));
                        iv.setNombreMedicamento(result.getString("nombre_m"));
                        iv.setIndicacionMedicamento(result.getString("indicaciones"));
		          
                        lista.add(iv);
		    }  
                }
            }catch (SQLException e) {
                
                System.out.println(e);
                
                }finally{
            
                    try {
                        
                        connection.close();
                        bd.desconectar();
                    
                    }catch (SQLException e){
		    
                        e.printStackTrace();
		    }
		}
        return lista;
    }
}
