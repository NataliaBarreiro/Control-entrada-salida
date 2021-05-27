/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Vinni
 */
@ManagedBean
@SessionScoped
public class ValidarBean implements Serializable{
    
    private String usuario;
    
    private String mensaje;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


   
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public ValidarBean() {
    }
    public void guardar(){
        System.out.println("Validación ");
        System.out.println("- El usuario ingresado: "+usuario);

    }
    
}
