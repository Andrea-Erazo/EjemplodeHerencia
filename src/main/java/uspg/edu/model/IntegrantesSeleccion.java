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
public class IntegrantesSeleccion {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    public IntegrantesSeleccion() {
    }

    public IntegrantesSeleccion(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
      
}
    
    public void concentrarse(){
        System.out.println("Concentrase");
    }
    public void viajar(){
        System.out.println("Viajando");
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    

   

        
    }
    
