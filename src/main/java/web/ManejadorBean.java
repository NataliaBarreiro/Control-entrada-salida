/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Vinni
 */
@ManagedBean
@SessionScoped
public class ManejadorBean implements Serializable {
    
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    

    /**
     * Creates a new instance of ManejadorBean
     */
    public ManejadorBean() {
    }
    public void guardar(){
        System.out.println("Ingreso ");
        System.out.println(" La fecha "+fecha);
    }
}
