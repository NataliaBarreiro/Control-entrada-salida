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
public class EliminarBean implements Serializable{
    
    private String nombre;
    private Long id;
    private int edad;
    private String cargo;
    private Date fechaVinculacion;
    private String rol;
    private String mensaje;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
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
    
    
    public EliminarBean() {
    }
    public void guardar(){
        System.out.println("Ingreso ");
        System.out.println("- El nombre completo eliminado: "+nombre);
        System.out.println("- El numero de identificacion eliminado: "+id);
        System.out.println("- La edad eliminada: "+edad);
        System.out.println("- El cargo eliminado: "+cargo);
        System.out.println("- La fecha de vinculacion no eliminada: ");
        System.out.println("- El rol eliminado: "+rol);
    }
    
}
