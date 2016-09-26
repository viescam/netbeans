/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;


public class Pelicula {
    
    private String nombre;
    private int diasAlguiler;
    private String edadMaxCliente;
    private String formaPago;
    private String especificaciones;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the diasAlguiler
     */
    public int getDiasAlguiler() {
        return diasAlguiler;
    }

    /**
     * @param diasAlguiler the diasAlguiler to set
     */
    public void setDiasAlguiler(int diasAlguiler) {
        this.diasAlguiler = diasAlguiler;
    }

    /**
     * @return the edadMaxCliente
     */
    public String getEdadMaxCliente() {
        return edadMaxCliente;
    }

    /**
     * @param edadMaxCliente the edadMaxCliente to set
     */
    public void setEdadMaxCliente(String edadMaxCliente) {
        this.edadMaxCliente = edadMaxCliente;
    }

    /**
     * @return the formaPago
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * @return the Especificaciones
     */
    public String getEspecificaciones() {
        return especificaciones;
    }

    /**
     * @param Especificaciones the Especificaciones to set
     */
    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }
    
}
