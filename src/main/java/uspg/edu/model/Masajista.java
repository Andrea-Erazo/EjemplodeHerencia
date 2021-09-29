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
public class Masajista extends IntegrantesSeleccion {
    private String titulacion;
    private int añosdeExperiencia;
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    public Masajista() {
        super();
    }

    public Masajista(String titulacion, int añosdeExperiencia, 
            Integer id, String nombre, 
            String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosdeExperiencia = añosdeExperiencia;
        this.id = id;
        this.nombre = nombre;
        this.apellidos= apellidos;
        this.edad = edad;  
    }
    
    public void darMasaje(){}

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosdeExperiencia() {
        return añosdeExperiencia;
    }

    public void setAñosdeExperiencia(int añosdeExperiencia) {
        this.añosdeExperiencia = añosdeExperiencia;
    }
    
    

    
    
    }
    
   
  
    
    
    

