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
public class EditarBean implements Serializable{
    
   private String nombre;
    private int edad;
    private String cargo;
    private String rol;
    private String mensaje;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public EditarBean() {
    }
    public void guardar(){
        System.out.println("Edición ");
        System.out.println("- El nombre completo ingresado: "+nombre);
        System.out.println("- La edad ingresada: "+edad);
        System.out.println("- El cargo ingresado: "+cargo);
        System.out.println("- El rol ingresado: "+rol);
    } 
}
