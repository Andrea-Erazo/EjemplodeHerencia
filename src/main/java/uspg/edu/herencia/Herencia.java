/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.herencia;

import uspg.edu.model.Entrenador;
import uspg.edu.model.Futbolista;

/**
 *
 * @author Usuario
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbolista messi = new Futbolista();
        
        messi.Jugarpartido();
        messi.entrenar();
        messi.Concentrarse();
       
        Entrenador entrenador = new Entrenador();
        
        entrenador.Dirigirpartido();
        entrenador.DirigirEntrenamiento();
        
        
        
        
        
        
        
    
}
}
