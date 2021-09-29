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
public class Entrenador extends IntegrantesSeleccion{
    
    public Integer idFederacion;
    public Integer id;
    public String nombre;
    public String apellidos;
    public Integer edad;
    
    
   
    public Entrenador() {
    super();
    }

    public Entrenador(Integer idFederacion, Integer id, 
            String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
        this.id= id;
        this.nombre= nombre;
        this.apellidos = apellidos;
        this.edad= edad;
        
        
    }
      
 
    public void Dirigirpartido(){}
    
    public void DirigirEntrenamiento(){}

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    
}
