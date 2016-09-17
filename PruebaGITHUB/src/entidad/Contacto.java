/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author Daw_1
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private Date fechaNac;
    private String ciudad;
    
    public Contacto(){}

    
    public int getId() {
        return id;
    }

      public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public java.sql.Date getFechaSQL() {
    	java.sql.Date fechaSQL = new java.sql.Date(fechaNac.getTime());
    	return fechaSQL;
    }
    
    public void setFechaSQL(java.sql.Date fechaSQL) {
    	this.fechaNac= new Date(fechaSQL.getTime());
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", telefono=" + telefono + ", fechaNac=" + fechaNac + ", ciudad=" + ciudad + '}';
    }
    
    
    
    
    
}
