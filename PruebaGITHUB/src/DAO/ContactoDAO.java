package DAO;

import entidad.Contacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ContactoDAO {
    
    public ContactoDAO(){}
    static PreparedStatement st;

    
    public ArrayList<Contacto> seleccionar(){
        Connection con=null;
        Conexion conexion = new Conexion();
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        try{
            //System.out.println("Abrir Conexion");
            con = conexion.AbrirConexion();
            //System.out.println("Conexion abierta");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        try{
            st=con.prepareStatement("SELECT * FROM contacto");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Contacto cont = new Contacto();
                cont.setId(rs.getInt("id"));
                cont.setNombre(rs.getString("Nombre"));
                cont.setApellido1(rs.getString("Apellido1"));
                cont.setApellido2(rs.getString("Apellido2"));
                cont.setTelefono(rs.getString("Telefono"));
                cont.setFechaSQL(rs.getDate("FechaNacimiento"));
                cont.setCiudad(rs.getString("Ciudad"));
                
                listaContactos.add(cont);
            }
            
        }catch(Exception e){
            e.printStackTrace();}
        try{
            System.out.println("Cerrar conexión");
            conexion.CerrarConexion(con);
            System.out.println("Conexión Cerrada");
        }catch (Exception ex){
                ex.printStackTrace();
        }
        //return listaContactos;
        return listaContactos;
    }
    
    public ArrayList<Contacto> seleccionarXCiudad(String ciudad){
        Connection con=null;
        Conexion conexion = new Conexion();
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        try{
            //System.out.println("Abrir Conexion");
            con = conexion.AbrirConexion();
            //System.out.println("Conexion abierta");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        try{
            st=con.prepareStatement("SELECT * FROM contacto WHERE Ciudad='"+ciudad+"'");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Contacto cont = new Contacto();
                cont.setId(rs.getInt("id"));
                cont.setNombre(rs.getString("Nombre"));
                cont.setApellido1(rs.getString("Apellido1"));
                cont.setApellido2(rs.getString("Apellido2"));
                cont.setTelefono(rs.getString("Telefono"));
                cont.setFechaSQL(rs.getDate("FechaNacimiento"));
                
                listaContactos.add(cont);
            }
            
        }catch(Exception e){
            e.printStackTrace();}
        try{
            System.out.println("Cerrar conexión");
            conexion.CerrarConexion(con);
            System.out.println("Conexión Cerrada");
        }catch (Exception ex){
                ex.printStackTrace();
        }
        //return listaContactos;
        return listaContactos;
    }
    
    public void actualizar(Contacto c,int pos){
        Connection con=null;
    
        Conexion conexion = new Conexion();
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        try{
            //System.out.println("Abrir Conexion");
            con = conexion.AbrirConexion();
            //System.out.println("Conexion abierta");
        }catch (Exception ex){
            ex.printStackTrace();
        }
         try{
            st=con.prepareStatement("UPDATE contacto SET id="+c.getId()+",Nombre='"+c.getNombre()+"',Apellido1='"+c.getApellido1()+"',Apellido2='"+c.getApellido2()+"',Telefono='"+c.getTelefono()+"',FechaNacimiento='"+c.getFechaSQL()+"',Ciudad='"+c.getCiudad()+"' WHERE id="+pos);
            st.executeUpdate();                     
        }catch(Exception e){
            e.printStackTrace();}    
        try{
            System.out.println("Cerrar conexión");
            conexion.CerrarConexion(con);
            System.out.println("Conexión Cerrada");
        }catch (Exception ex){
                ex.printStackTrace();
        }
   }
    
  public void eliminar(int pos){
        Connection con=null;
        Conexion conexion_DB = new Conexion();
        try {
                System.out.println("Abrir Conexion");
                con = conexion_DB.AbrirConexion();
                System.out.println("Conexion abierta");
        } catch (Exception ex) {
                ex.printStackTrace();
        }
        try {
                st = con.prepareStatement("DELETE FROM contacto WHERE id="+pos);
                st.executeUpdate();
                
        } catch (Exception e) {
                System.out.println("Error en la sentencia SQL de eliminacion");
        } 
        try {
                System.out.println("Cerrar Conexion");
                conexion_DB.CerrarConexion(con);
                System.out.println("Conexion cerrada");
        } catch (Exception e) {
                e.printStackTrace();
        }
        
    }
  
  public void insertar(Contacto c){
        Connection con=null;
        Conexion conexion = new Conexion();
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        try{
            //System.out.println("Abrir Conexion");
            con = conexion.AbrirConexion();
            //System.out.println("Conexion abierta");
        }catch (Exception ex){
            ex.printStackTrace();
        }
         try{
            //st=con.prepareStatement("INSERT INTO contacto VALUES("+c.getId()+",'"+c.getNombre()+"','"+c.getApellido1()+"','"+c.getApellido2()+"','"+c.getTelefono()+"','"+c.getFechaSQL()+"'");
            st=con.prepareStatement("INSERT INTO contacto VALUES (?,?,?,?,?,?,?)");
            st.setInt(1, c.getId());
            st.setString(2,c.getNombre());
            st.setString(3,c.getApellido1());
            st.setString(4,c.getApellido2());
            st.setString(5,c.getTelefono());
            st.setDate(6,c.getFechaSQL());
            st.setString(7,c.getCiudad());
            st.executeUpdate();                     
        }catch(Exception e){
            e.printStackTrace();}    
        try{
            System.out.println("Cerrar conexión");
            conexion.CerrarConexion(con);
            System.out.println("Conexión Cerrada");
        }catch (Exception ex){
                ex.printStackTrace();
        }
   }
  
    public ArrayList<String> ciudades(){
        Connection con=null;
        Conexion conexion = new Conexion();
        ArrayList<String> ciudades = new ArrayList<String>();
        try{
            //System.out.println("Abrir Conexion");
            con = conexion.AbrirConexion();
            //System.out.println("Conexion abierta");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        try{
            st=con.prepareStatement("SELECT DISTINCT Ciudad FROM contacto ORDER BY Ciudad");               
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                String ciudad=rs.getString("Ciudad");
                               
                ciudades.add(ciudad);
            }                    
        }catch(Exception e){
            e.printStackTrace();}
        try{
            System.out.println("Cerrar conexión");
            conexion.CerrarConexion(con);
            System.out.println("Conexión Cerrada");
        }catch (Exception ex){
                ex.printStackTrace();
        }
        return ciudades;
    }
}
