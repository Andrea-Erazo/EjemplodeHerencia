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
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    public String desmarcacion;

    public Futbolista() {
    }
    

    public Futbolista(int dorsal, String desmarcacion) {
        this.dorsal = dorsal;
        this.desmarcacion = desmarcacion;
    }
    
    public void entrenar(){
        System.out.println("");
        
    
    }
    
    public void Jugarpartido(){
        
    }
    
    
    
}
