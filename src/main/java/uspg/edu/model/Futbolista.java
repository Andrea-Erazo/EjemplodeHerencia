/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.model;

/**
 *
 * @author Usuario
 */
public class Futbolista extends IntegrantesSeleccion {
    private int dorsal;
    public String desmarcacion;
    public Integer id;
    public String nombre;
    public String apellidos;
    public int edad;

    public Futbolista() {
        super();
    }

    public Futbolista(int dorsal, String desmarcacion,  Integer id, String nombre, 
            String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.desmarcacion = desmarcacion;
        this.id= id;
        this.nombre= nombre;
        this.apellidos = apellidos;
        this.edad= edad;
        
        
    }
    
    public void jugarPartido(){}
    
    public void entrenar(){}

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDesmarcacion() {
        return desmarcacion;
    }

    public void setDesmarcacion(String desmarcacion) {
        this.desmarcacion = desmarcacion;
    }
    
    
    

    
    }
    
   
    
    
    
    
    
    
    

