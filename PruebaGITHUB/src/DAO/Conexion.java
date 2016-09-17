
package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {
    
    public Connection AbrirConexion() throws Exception{
        Connection con;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String urlBBDD = "jdbc:mysql://localhost:3306/agendaeg";
            con = (java.sql.DriverManager.getConnection(urlBBDD,"root",""));
            //System.out.println("Conexion Realizada");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("No se ha podido establecer la conexión"+ e.getMessage());
        }
    }
	
    public void CerrarConexion(Connection con) throws Exception{
        try{
            if(con!=null) 
                    con.close();
        }
        catch(Exception e){
            throw new Exception("Ha sido imposible cerrar la conexión con la base de datos");
        }
    }
    
}
