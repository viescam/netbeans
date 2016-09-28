/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_medicas;


public class SolicitudOperacion {
    private String practica;
    private int cantidad;
    private String estadoAutorizacion;
    private String motivoRechazo;

    /**
     * @return the practica
     */
    public String getPractica() {
        return practica;
    }

    /**
     * @param practica the practica to set
     */
    public void setPractica(String practica) {
        this.practica = practica;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getSetEstadoAutorizacion(){
        if(Math.random() < 0.5) {
            estadoAutorizacion="Autorizada";
        }
        else{
            estadoAutorizacion="Rechazada";
        }
        return estadoAutorizacion;
    }
    
    public String getSetMotivoRechazo(){
        String[] motivosRechazo={"La autorización se realizó fuera de plazo", "No quedan suficientes suministros para administrar esa cantidad",
            "No existe conexión con el servidor"};
        if(estadoAutorizacion=="Autorizada"){
            motivoRechazo="";
        }else{
            int aleatorio = (int) (Math.random() * 3 + 0);
             motivoRechazo=motivosRechazo[aleatorio];
        }
        return motivoRechazo;
        
    }
}

